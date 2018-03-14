package knowey;
import java.text.*;
import java.time.*;
import java.time.chrono.*;
import java.util.*;

public class Connaissance
	{
	Brain nekiyaK;
	final String[] chSalutations = {"bonjour", "salut", "coucou", "hello", "hé", "hey"};
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
					for(int k=0; k<this.chSalutations.length; k++)
						{
						if(parTab[i][j].equals(this.chSalutations[k]))
							{
							nekiyaK.setReponse(this.chSalutations[new Random().nextInt(this.chSalutations.length)+1] + " " + nekiyaK.chUser + " !");
							this.chDiscussionAvant.chBonjour = true;
							}
						}
					}
				}
			}
		}
	
	}