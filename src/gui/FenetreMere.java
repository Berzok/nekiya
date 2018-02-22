package gui;
import javax.swing.*;
import javax.swing.JOptionPane;

public class FenetreMere extends JFrame
	{
	String chUtilisateur;
	
	public FenetreMere()
		{
		super("Nekiya");
		new JOptionPane();
		chUtilisateur = JOptionPane.showInputDialog(null, "Qui êtes-vous ?", " ", JOptionPane.QUESTION_MESSAGE);
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		InterfaceG laInterface = new InterfaceG(this, chUtilisateur);
		laInterface.chSaisie.requestFocus();
		}
	
	public static void main(String[] args)
		{
		FenetreMere laFenetre = new FenetreMere();
		laFenetre.validate();
		laFenetre.repaint();
		}
	
	public void createInterface()
		{
		}
	}