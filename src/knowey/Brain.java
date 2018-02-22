package knowey;
import java.io.*;

public class Brain
	{
	String[] chPhraseVirgules;
	String[] chMotsPhrase;
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
		chPhrase = this.reduirePhrase(parPhrase);
		chPhraseReponse = this.tab2String(chPhrase);
		}
	
	
	public String[] reduirePhrase(String parPhrase)
		{
		String[] leTampon = parPhrase.split(",");
		String leTampon1 = new String();
		
		for(int i=0; i<leTampon.length; i++)
			{
			leTampon1 = leTampon1+ leTampon[i];
			}
		leTampon = leTampon1.split(" ");
		
		return leTampon;
		}
	
	
	
	public String tab2String(String[] parTab)
		{
		String leString = null;
		for(int i=0; i<parTab.length; i++)
			{
			leString = leString + parTab[i];
			}
		return leString;
		}
	public String getReponse()
		{
		return chPhraseReponse;
		}
	}