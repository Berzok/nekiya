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
	Brain Sylvie;
	String chReponse;
	JScrollPane leScroll;
	SimpleAttributeSet styleUser;
	SimpleAttributeSet styleSylvie;
	
	
	public InterfaceG(Brain sylvieK, FenetreMere parFenetre, String parUtilisateur)
		{
		chUtilisateur = parUtilisateur;
		Sylvie = sylvieK;
		Sylvie.chUser = chUtilisateur;
		
		
		
		chUser = new JTextArea("" + chUtilisateur + ": ");
		chUser.setEditable(false);
		chUser.setBackground(Color.gray);
		
		
		
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
			String laPhrase = phraseUser;
			if(laPhrase.equals("exit"))
				{
				e.consume();
				this.quitter();
				}
			this.append(chDiscussion, chUtilisateur+": " + phraseUser + "\n", false);
			e.consume();
			chSaisie.setText(null);
			chSaisie.requestFocus(true);
			
			
			/**
			 * Sylvie.penser(String) ==> Conversion de la phrase en tableau splité par les virgules
			 * 								-
			 */
			
			Sylvie.penser(phraseUser);
			chReponse = Sylvie.getReponse();
			this.append(chDiscussion, "Sylvie: " + chReponse + "\n", true);
			}
		if(key == KeyEvent.VK_ESCAPE)
			{
			System.exit(0);
			}
		}
	
	
	
	
	
	public void append(JTextPane parPane, String parString, boolean isSylvie) {
		   try {
		      Document doc = parPane.getDocument();
		      if(isSylvie)
		      	{
		    	  doc.insertString(doc.getLength(), parString, styleSylvie); 
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
		styleSylvie = this.defStyle(true);
		
		
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
		
		JLabel sylvieIsTyping = new JLabel("Sylvie écrit... ");
		sylvieIsTyping.setForeground(Color.LIGHT_GRAY);
		
		chSaisie = new JTextArea(2, 0);
		chSaisie.setLineWrap(true);
		chSaisie.addKeyListener(this);
		chSaisie.setBorder(lePadding2);
		
		lePanel.add(leScroll, BorderLayout.CENTER);
		lePanel2.add(sylvieIsTyping);
		lePanel2.add(chUser, BorderLayout.WEST);
		lePanel2.add(chSaisie);
		lePanel.add(lePanel2, BorderLayout.SOUTH);
		
		
		
		return lePanel;
		}
	
	public SimpleAttributeSet defStyle(boolean isSylvie)
		{
		SimpleAttributeSet tempoStyle = new SimpleAttributeSet();
		
		if(isSylvie)
			{
			StyleConstants.setForeground(tempoStyle, new Color(175, 72, 141));
			}
		else
			{
			StyleConstants.setForeground(tempoStyle, new Color(119, 136, 153));
			}
		return tempoStyle;
		}
	
	public void quitter()
		{
		System.exit(0);
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