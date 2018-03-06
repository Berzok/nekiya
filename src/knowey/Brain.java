package knowey;
import java.io.*;

public class Brain
	{
	String[] chTriVirgules;
	String[][] chTriSegments;
	String[] chPhrase;
	String chPhraseReponse;
	
	public Brain()
		{
		

		}
	public static void main(String[] args)
		{
		
		}
	
	public void penser(String parPhrase)
		{
		this.decoupagePhrase(parPhrase);
//		chPhraseReponse = this.tab2String(chPhrase);
		}
	
	
	public void decoupagePhrase(String parPhrase)
		{
		chTriVirgules = parPhrase.split(",");
		
		String[] leTampon = new String[chTriVirgules.length];
		for(int i=0; i<chTriVirgules.length; i++)
			{
			leTampon[i] = chTriVirgules[i];
			}
		String leTampon2 = tab2String(leTampon);
		
		for(int i=0; i<chTriVirgules.length; i++)
			{
			leTampon[i] = chTriVirgules[i];
			}
		chTriSegments[0] = leTampon2.split(" ");
		
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