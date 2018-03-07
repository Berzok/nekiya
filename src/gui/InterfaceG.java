package gui;
import knowey.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;


public class InterfaceG extends JPanel implements ActionListener, KeyListener
	{
	JTextArea chSaisie;
	JTextPane chDiscussion;
	JButton chBouton;
	String chUtilisateur;
	JTextArea chUser;
	JLabel chNekiyaIsTyping;
	Brain Nekiya;
	String chReponse;
	JScrollPane leScroll;
	SimpleAttributeSet styleUser;
	SimpleAttributeSet styleNekiya;
	
	
	public InterfaceG(Brain nekiyaK, FenetreMere parFenetre, String parUtilisateur)
		{
		chUtilisateur = parUtilisateur;
		Nekiya = nekiyaK;
		
		
		
		chUser = new JTextArea("" + chUtilisateur + ": ");
		chUser.setEditable(false);
		chUser.setBackground(Color.gray);
		
		chNekiyaIsTyping = new JLabel("Nekiya écrit... ");
		
		
		parFenetre.add(this.createInterface());
		
		this.setVisible(true);
		this.validate();
		this.repaint();
		}
	
	
	@Override
	public void keyPressed(KeyEvent e)
		{
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_ENTER)
			{
			String phraseUser = chSaisie.getText();
			String[] laPhrase; laPhrase = new String[1]; laPhrase[0] = phraseUser;
			System.out.println(phraseUser);
			if(laPhrase[0] == "exit")
				{
				System.out.println("Ahh");
				}
			this.append(chDiscussion, chUtilisateur+": " + phraseUser + "\n", false);
			e.consume();
			chSaisie.setText(null);
			chSaisie.requestFocus(true);
			
			
			/**
			 * Nekiya.penser(String) ==> Conversion de la phrase en tableau splité par les virgules
			 * 								-
			 */
			
			Nekiya.penser(phraseUser);
			chReponse = Nekiya.getReponse();
			this.append(chDiscussion, "Nekiya: " + chReponse + "\n", true);
			}
		if(key == KeyEvent.VK_ESCAPE)
			{
			System.exit(0);
			}
		}
	
	
	
	
	
	public void append(JTextPane parPane, String parString, boolean isNekiya) {
		   try {
		      Document doc = parPane.getDocument();
		      if(isNekiya)
		      	{
		    	  doc.insertString(doc.getLength(), parString, styleNekiya); 
		      	}
		      else
		      	{
		    	  doc.insertString(doc.getLength(), parString, styleUser);
		      	}
		   } catch(BadLocationException exc) {
		      exc.printStackTrace();
		   }
		}
	
	public JPanel createInterface()
		{
		JPanel lePanel = new JPanel();
		JPanel lePanel2 = new JPanel();
		
		styleUser = this.defStyle(false);
		styleNekiya = this.defStyle(true);
		
		
		lePanel.setBackground(Color.GRAY);
		lePanel.setPreferredSize(new Dimension(600, 400));
		lePanel.setLayout(new BorderLayout(5, 12));
		Border lePadding = BorderFactory.createEmptyBorder(10, 10, 10, 10);
		lePanel.setBorder(lePadding);
		
		lePanel2.setLayout(new BorderLayout(5, 5));
		Border lePadding2 = BorderFactory.createEmptyBorder(2, 2, 2, 2);
		lePanel2.setBorder(lePadding2);
		lePanel2.setBackground(Color.BLACK);
		
		chDiscussion = new JTextPane();
		chDiscussion.setEditable(false);
//		chDiscussion(true);
		chDiscussion.setBackground(new Color(255, 255, 255));
		leScroll = new JScrollPane(chDiscussion);
		
		chSaisie = new JTextArea(2, 0);
		chSaisie.setLineWrap(true);
		chSaisie.addKeyListener(this);
		chSaisie.setBorder(lePadding2);
		
		lePanel.add(leScroll, BorderLayout.CENTER);
		lePanel.add(lePanel2, BorderLayout.SOUTH);
//		lePanel.add(chNekiyaIsTyping, BorderLayout.AFTER_LAST_LINE);
		lePanel2.add(chUser, BorderLayout.WEST);
		lePanel2.add(chSaisie);
		
		return lePanel;
		}
	
	public SimpleAttributeSet defStyle(boolean isNekiya)
		{
		SimpleAttributeSet tempoStyle = new SimpleAttributeSet();
		
		if(isNekiya)
			{
			StyleConstants.setForeground(tempoStyle, new Color(175, 72, 141));
			}
		else
			{
			StyleConstants.setForeground(tempoStyle, new Color(119, 136, 153));
			}
		
		return tempoStyle;
		}
	
	@Override
	public void keyReleased(KeyEvent arg0)
		{
		
		}

	@Override
	public void keyTyped(KeyEvent arg0)
		{
		
		}

	@Override
	public void actionPerformed(ActionEvent arg0)
		{
		
		}
	
	}