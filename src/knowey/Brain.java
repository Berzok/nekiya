package knowey;
import java.io.*;

public class Brain
	{
	String[] chTriVirgules;
	int nbreSegments;
	String[][] chTriSegments;
	String[] chPhrase;
	String chPhraseReponse;
	
	public Brain()
		{
		

		}
	public static void main(String[] args)
		{
//		Brain mayor = new Brain();
//		mayor.penser("");
		}
	
	public void penser(String parPhrase)
		{
		this.decoupagePhrase(parPhrase);
//		chPhraseReponse = this.tab2String(chPhrase);
		}
	
	
	public void decoupagePhrase(String parPhrase)
		{
		if(parPhrase == null)
			{
			System.out.println("non");
			return;
			}
		chTriVirgules = parPhrase.split(", ");
		String[] cpTriVirgules = new String[chTriVirgules.length];
		nbreSegments = chTriVirgules.length;
		
		//On recopie la phrase tri�e dans un String[]
		for(int i=0; i<chTriVirgules.length; i++)
			{
			cpTriVirgules[i] = chTriVirgules[i];
			}
		
		//On recopie la phrase tri�e dans un String
		String cpTriVirgules2 = tab2String(cpTriVirgules);
		
		//On d�finit chTriSegments avec le nombre de cases en fonction du nombre de segments
		chTriSegments = new String[nbreSegments][];
		
		for(int i=0; i<chTriSegments.length; i++)
			{
			String tempoRaire = cpTriVirgules[i];
			chTriSegments[i] = tempoRaire.split(" ");
			}
		
		
//		afficherTableau1D(chTriVirgules);
//		afficherTableau2D(chTriSegments);
		}
	
	
	
	
	//Remplit un tableau de String 
	public String fillString1D(String[] parTab, String parString)
		{
		String leString = new String();
		for(int i=0; i<parTab.length; i++)
			{
//			parTab[i] = 
			}
		return leString;
		}
	
	public String tab2String(String[] parTab)
		{
		String leString = new String("");
		for(int i=0; i<parTab.length; i++)
			{
			leString = leString + parTab[i];
			}
		return leString;
		}
	
	public void afficherTableau1D(String[] parTab)
		{
		for(int i=0; i<parTab.length; i++)
			{
			System.out.println(i+": "+parTab[i]);
			}
		System.out.println(" ");
		}
	public void afficherTableau2D(String[][] parTab)
		{
		for(int i=0; i<parTab.length; i++)
			{
			for(int j=0; j<parTab[i].length; j++)
				{
				System.out.println("["+i+"]["+"j"+"] " + parTab[i][j]);
				}
			}
		}
	public String getReponse()
		{
		return chPhraseReponse;
		}
	}