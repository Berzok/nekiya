package knowey;
import java.io.*;

public class Brain
	{
	String[] chTriVirgules;
	String[] chTriSegments;
	String[] chPhrase;
	String chPhraseReponse;
	
	public Brain()
		{
		

		}
	public static void main(String[] args)
		{
		Brain mayor = new Brain();
		mayor.penser("hello a toi, bonjour vous");
		}
	
	public void penser(String parPhrase)
		{
		this.decoupagePhrase(parPhrase);
//		chPhraseReponse = this.tab2String(chPhrase);
		}
	
	
	public void decoupagePhrase(String parPhrase)
		{
		
		chTriVirgules = parPhrase.split(", ");
		String[] leTampon = new String[chTriVirgules.length];
		for(int i=0; i<chTriVirgules.length; i++)
			{
			leTampon[i] = chTriVirgules[i];
			}
		String leTampon2 = tab2String(leTampon);
		
		int longueurTriVirgules = chTriVirgules.length;
		chTriSegments = new String[longueurTriVirgules];
		String[] leTampon3 = new String[longueurTriVirgules];
		
		for(int i=0; i<chTriVirgules.length; i++)
			{
			leTampon3 = chTriVirgules[i].split(" ");
			for(int j=0; j<leTampon3.length; j++)
				{
				chTriSegments[j] = leTampon3[j];								
				}
			}
		
		for(int i=0; i<chTriVirgules.length; i++)
			{
			leTampon2 = chTriVirgules[i];
			System.out.println("t2: " + leTampon2);
			chTriSegments = leTampon2.split(" ");				
			}
		
				
		
		System.out.println("tri segments taille: " + chTriSegments.length);
		afficherTableau(chTriVirgules);
		afficherTableau(chTriSegments);
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
	public void afficherTableau(String[] parTab)
		{
		for(int i=0; i<parTab.length; i++)
			{
			System.out.println(i+": "+parTab[i]);
			}
		}
	public String getReponse()
		{
		return chPhraseReponse;
		}
	}