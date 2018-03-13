package knowey;
import java.text.*;
import java.time.*;
import java.time.chrono.*;
import java.util.*;

public class Connaissance
	{
	Brain nekiyaK;
	final String[] chSalutations = {"bonjour", "salut", "coucou", "hello"};
	String[] chAdieux;
	DejaVu chDiscussionAvant;
	public Connaissance(Brain leBrain)
		{
		nekiyaK = leBrain;
		chDiscussionAvant = new DejaVu();
		}
	public void direBonjour(String[][] parTab)
		{
		if(this.chDiscussionAvant.chBonjour == false)
			{
			for(int i=0; i<parTab.length; i++)
				{
				for(int j=0; j<parTab[i].length; j++)
					{
					for(int k=0; k<chKnowledge.chSalutations.length; k++)
						{
						if(parTab[i][j].equals(chKnowledge.chSalutations[k]))
							{
							this.setReponse(chKnowledge.chSalutations[k] + " " + chUser + " !");
							this.chDiscussionAvant.chBonjour = true;
							}
						}
					}
				}
			}
		}
	
	}