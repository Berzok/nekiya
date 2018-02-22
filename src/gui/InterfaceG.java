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
	
	public InterfaceG(FenetreMere parFenetre, String parUtilisateur)
		{
		chUtilisateur = parUtilisateur;
		
		JPanel lePanel = new JPanel();
		lePanel.setBackground(Color.GRAY);
		lePanel.setPreferredSize(new Dimension(600, 400));
		lePanel.setLayout(new BorderLayout(5, 12));
		
		
		chDiscussion = new JTextArea(2, 0); chDiscussion.setEditable(false); chDiscussion.setLineWrap(true); chDiscussion.setBackground(new Color(255, 255, 255));
		chSaisie = new JTextArea(2, 0); chSaisie.setLineWrap(true); chSaisie.addKeyListener(this);
		
		lePanel.add(chDiscussion, BorderLayout.CENTER);
		lePanel.add(chSaisie, BorderLayout.SOUTH);
		
		Border padding = BorderFactory.createEmptyBorder(10, 10, 10, 10);
		lePanel.setBorder(padding);
		parFenetre.add(lePanel);
		this.setVisible(true);
		this.validate();
		this.repaint();
		}
	
	public Insets getInsets()
		{
		return new Insets(10, 10, 10, 10);
		}
	
	
	@Override
	public void keyPressed(KeyEvent e)
		{
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_ENTER)
			{
			chDiscussion.append(chSaisie.getText());
			chSaisie.setText(null); chSaisie.append(chUtilisateur + ": ");
			chSaisie.setCaretPosition(0);
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