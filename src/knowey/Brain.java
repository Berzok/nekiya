package knowey;

public class Brain
	{
	String[] chPhraseVirgules;
	String[] chMotsPhrase;
	
	public Brain(String parPhraseU)
		{
		chPhraseVirgules = parPhraseU.split(",");
		String tampon = new String();
		for(int i=0; i<chPhraseVirgules.length; i++)
			{
			tampon = tampon + chPhraseVirgules[i];
			System.out.print(i + " " + chPhraseVirgules[i] + "\n");
			System.out.print(tampon);
			}
		chMotsPhrase = tampon.split(" ");
		for(int i=0; i<chMotsPhrase.length; i++)
			{
			System.out.print(i + " " + chMotsPhrase[i] + "\n");
			}
		}
	public static void main(String[] args)
		{
		Brain knowey = new Brain("Ceci, est une phrase, sympa, non");
		}
	}