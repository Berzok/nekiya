package gui;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
import javax.swing.border.Border;


public class InterfaceG extends JPanel implements ActionListener, KeyListener
	{
	JTextArea chSaisie;
	JTextArea chDiscussion;
	JButton chBouton;
	String chUtilisateur;
	JTextArea chUser;
	JLabel chNekiyaIsTyping;
	
	public InterfaceG(FenetreMere parFenetre, String parUtilisateur)
		{
		chUtilisateur = parUtilisateur;
		
		JPanel lePanel = new JPanel();
		JPanel lePanel2 = new JPanel();
		
		lePanel.setBackground(Color.GRAY);
		lePanel.setPreferredSize(new Dimension(600, 400));
		lePanel.setLayout(new BorderLayout(5, 12));
		Border lePadding = BorderFactory.createEmptyBorder(10, 10, 10, 10);
		lePanel.setBorder(lePadding);
		
		lePanel2.setLayout(new BorderLayout(5, 5));
		Border lePadding2 = BorderFactory.createEmptyBorder(2, 2, 2, 2);
		lePanel2.setBorder(lePadding2);
		lePanel2.setBackground(Color.BLACK);
		
		chDiscussion = new JTextArea();
		chDiscussion.setEditable(false);
		chDiscussion.setLineWrap(true);
		chDiscussion.setBackground(new Color(255, 255, 255));
		
		chSaisie = new JTextArea(2, 0);
		chSaisie.setLineWrap(true);
		chSaisie.addKeyListener(this);
		chSaisie.setBorder(lePadding2);
		
		chUser = new JTextArea("" + chUtilisateur + ": ");
		chUser.setEditable(false);
		chUser.setBackground(Color.gray);
		
		chNekiyaIsTyping = new JLabel("Nekiya écrit... ");
		
		lePanel.add(chDiscussion, BorderLayout.CENTER);
		lePanel.add(lePanel2, BorderLayout.SOUTH);
//		lePanel.add(chNekiyaIsTyping, BorderLayout.AFTER_LAST_LINE);
		lePanel2.add(chUser, BorderLayout.WEST);
		lePanel2.add(chSaisie);
		
		parFenetre.add(lePanel);
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
			chDiscussion.append(chUtilisateur + ": " + chSaisie.getText() + "\n");
			e.consume();
			chSaisie.setText(null);
			chSaisie.requestFocus(true);
			}
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