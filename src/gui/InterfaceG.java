package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;


public class InterfaceG extends JPanel implements ActionListener, KeyListener
	{
	JTextArea chSaisie;
	JTextArea chDiscussion;
	JButton chBouton;
	String chUtilisateur;
	
	public InterfaceG(FenetreMere parFenetre, String parUtilisateur)
		{
		chUtilisateur = parUtilisateur;
		
		JPanel lePanel1 = new JPanel();				//Le panel du haut, ya rien en fait
		lePanel1.setLayout(new BoxLayout(lePanel1, BoxLayout.LINE_AXIS));
		lePanel1.add(Box.createVerticalStrut(11));
		
		JPanel lePanel2 = new JPanel();				//Contient la zone de discussion
		lePanel2.setLayout(new BoxLayout(lePanel2, BoxLayout.LINE_AXIS));
		chDiscussion = new JTextArea(2, 2); chDiscussion.setEditable(false);		
		lePanel2.add(Box.createHorizontalStrut(17));
		lePanel2.add(chDiscussion);
		lePanel2.add(Box.createHorizontalStrut(180));
		
		
		JPanel lePanel3 = new JPanel();				//La zone d'envoi de messages
		lePanel3.setLayout(new BoxLayout(lePanel3, BoxLayout.LINE_AXIS));
		chSaisie = new JTextArea(2, 2); chSaisie.setLineWrap(true); chSaisie.addKeyListener(this);
		lePanel3.add(Box.createVerticalStrut(80));
		lePanel3.add(chSaisie);
		lePanel3.add(Box.createVerticalStrut(13));
		
		
		
		JPanel lePanel = new JPanel();
		lePanel.setLayout(new BoxLayout(lePanel, BoxLayout.PAGE_AXIS));
		lePanel.add(lePanel1);
		lePanel.add(lePanel2);
		lePanel.add(Box.createVerticalStrut(10));
		lePanel.add(lePanel3);
		
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
			chDiscussion.append(chSaisie.getText());
			chSaisie.setText("");
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