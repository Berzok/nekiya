package gui;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
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
		
		JPanel cell1 = new JPanel(); cell1.setPreferredSize(new Dimension(60, 40)); cell1.setBackground(Color.green);
		JPanel cell2 = new JPanel(); cell2.setPreferredSize(new Dimension(60, 40)); cell2.setBackground(Color.red);
		JPanel cell3 = new JPanel(); cell3.setPreferredSize(new Dimension(60, 40)); cell3.setBackground(Color.blue);
		JPanel cell4 = new JPanel(); cell4.setPreferredSize(new Dimension(60, 40)); cell4.setBackground(Color.gray);
		JPanel cell5 = new JPanel(); cell5.setPreferredSize(new Dimension(60, 40)); cell5.setBackground(Color.orange);
		JPanel cell6 = new JPanel(); cell6.setPreferredSize(new Dimension(60, 40)); cell6.setBackground(Color.cyan);
		JPanel cell7 = new JPanel(); cell7.setPreferredSize(new Dimension(60, 40)); cell7.setBackground(Color.green);
		JPanel cell8 = new JPanel(); cell8.setPreferredSize(new Dimension(60, 40)); cell8.setBackground(Color.green);
		JPanel cell9 = new JPanel(); cell9.setPreferredSize(new Dimension(60, 40)); cell9.setBackground(Color.yellow);
		JPanel cell10 = new JPanel(); cell10.setPreferredSize(new Dimension(60, 40)); cell10.setBackground(Color.red);
		JPanel cell11 = new JPanel(); cell11.setPreferredSize(new Dimension(60, 40)); cell1.setBackground(Color.green);
		JPanel cell12 = new JPanel(); cell12.setPreferredSize(new Dimension(60, 40)); cell12.setBackground(Color.magenta);
		JPanel cell13 = new JPanel(); cell13.setPreferredSize(new Dimension(60, 40)); cell1.setBackground(Color.green);
		JPanel cell14 = new JPanel(); cell14.setPreferredSize(new Dimension(60, 40)); cell1.setBackground(Color.green);
		
		JPanel lePanel = new JPanel();
		lePanel.setBackground(Color.PINK);
		lePanel.setPreferredSize(new Dimension(601, 401));
		lePanel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		
		lePanel.add(cell1, gbc);
		gbc.gridx=60; lePanel.add(cell2, gbc);
		gbc.gridx=120; lePanel.add(cell3, gbc);
		gbc.gridx=180; lePanel.add(cell4, gbc);
		gbc.gridx=240; lePanel.add(cell5, gbc);
		gbc.gridx=300; lePanel.add(cell6, gbc);
		gbc.gridx=360; lePanel.add(cell7, gbc);
		gbc.gridx=420; lePanel.add(cell8, gbc);
		gbc.gridx=480; lePanel.add(cell9, gbc);
//		gbc.gridx=540; lePanel.add(cell10, gbc);
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		
		gbc.gridx=0; gbc.gridy=40;
		gbc.gridwidth=1; gbc.gridheight=1;
		gbc.fill = GridBagConstraints.VERTICAL;
		lePanel.add(cell11, gbc);
		
		gbc.gridx = 1;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		lePanel.add(cell12, gbc);

		gbc.gridx = 60;
		gbc.gridy = 10;
		gbc.anchor = GridBagConstraints.LAST_LINE_START;
		chDiscussion = new JTextArea(); chDiscussion.setEditable(false); chDiscussion.setLineWrap(true); chDiscussion.setBackground(new Color(255, 255, 255));
		chSaisie = new JTextArea(); chSaisie.setLineWrap(true); chSaisie.addKeyListener(this);
		lePanel.add(chSaisie, gbc);
		
		
		
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