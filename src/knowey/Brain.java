package knowey;
import java.lang.*;

public class Brain
	{
	String[] chTriVirgules;
	int nbreSegments;
	String[][] chTriSegments;
	String[] chPhrase;
	String chPhraseReponse;
	Connaissance chKnowledge;
	DejaVu chAvant;
	public String chUser;
	
	public Brain()
		{
		chKnowledge = new Connaissance(this);
		chAvant = new DejaVu();
		}
	public static void main(String[] args)
		{
//		Brain mayor = new Brain();
//		mayor.penser("");
		}
	
	public void penser(String parPhrase)
		{
		this.decoupagePhrase(parPhrase);
		this.consulterConnaissance(chTriSegments);
//		chPhraseReponse = this.tab2String(chPhrase);
		}
	
	
	public void decoupagePhrase(String parPhrase)
		{
		if(parPhrase.equals(""))
			{
			return;
			}
		chTriVirgules = parPhrase.split(", ");
		String[] cpTriVirgules = new String[chTriVirgules.length];
		nbreSegments = chTriVirgules.length;
		
		//On recopie la phrase triée dans un String[]
		for(int i=0; i<chTriVirgules.length; i++)
			{
			cpTriVirgules[i] = chTriVirgules[i];
			}
		
		//On définit chTriSegments avec le nombre de cases en fonction du nombre de segments
		chTriSegments = new String[nbreSegments][];
		
		for(int i=0; i<chTriSegments.length; i++)
			{
			String tempoRaire = cpTriVirgules[i];
			chTriSegments[i] = tempoRaire.split(" ");
			}
		
		
//		afficherTableau1D(chTriVirgules);
//		afficherTableau2D(chTriSegments);
		}
	
	
	public void consulterConnaissance(String[][] parTab)
		{
		this.chKnowledge.direBonjour(parTab);
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
	public void setReponse(String parString)
		{
		chPhraseReponse = parString;
		}
	public String getReponse()
		{
		String laPhrase = chPhraseReponse;
		chPhraseReponse = null;
		return laPhrase;
		}
	}