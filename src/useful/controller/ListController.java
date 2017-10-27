package useful.controller;

import java.util.List;
import java.util.ArrayList;
import useful.model.Donut;
import useful.view.PopupDisplay;

public class ListController
{
	//Declares the list < > is needed
	
	private List<Donut> donutList;
	private PopupDisplay display;
	
	//Constructor needed
	
	public ListController()
	{
		donutList = new ArrayList<Donut>();
		display = new PopupDisplay();
	}
	
	public void start()
	{
		Donut temp = new Donut();
		
		donutList.add(temp);
		
		ArrayList<String> tempList = new ArrayList<String>();
		tempList.add("This is a word sequence");
		tempList.add("This is taking foreveer");
		tempList.add("I'm really hungry and could eat 254 donuts");
		tempList.add("lkadjslj");
		tempList.add("According to all known laws\n" + 
				"of aviation,\n" + 
				"\n" + 
				"  \n" + 
				"there is no way a bee\n" + 
				"should be able to fly.\n" + 
				"\n" + 
				"  \n" + 
				"Its wings are too small to get\n" + 
				"its fat little body off the ground.\n" + 
				"\n" + 
				"  \n" + 
				"The bee, of course, flies anyway\n" + 
				"\n" + 
				"  \n" + 
				"because bees don't care\n" + 
				"what humans think is impossible.\n");
		
		display.displayText("The longest text is " + maxLength(tempList) + " long." );
//		display.displayText("It is: " + longestString(tempList));
		fillTheList();
//		showTheList();
		changeTheList();
		practiceMessingWithTheList();
	}
	
	private void showTheList()
	{
		String favorite = "Maple Bar";
		for(int index = 0; index < donutList.size(); index += 1)
		{
			String currentFlavor = donutList.get(index).getFlavor();
			
			if(currentFlavor.equals(favorite))
			{
				for(int woop = 0; woop < 5; woop += 1)
				{
					display.displayText("The best flavor ever!!!!!!!");
				}
			}
			for (int currentLetterIndex = 0; currentLetterIndex < currentFlavor.length(); currentLetterIndex += 1)
			{
				display.displayText(currentFlavor.substring(currentLetterIndex,  currentLetterIndex +1));
			}
			
			display.displayText(donutList.get(index).toString());
		}
	}
	
	private void fillTheList()
 
	{
		Donut jellyFilled = new Donut("Jelly Filled");
		Donut mapleBar = new Donut("Maple Bar");
		Donut glazedDonut = new Donut("Glazed");
		Donut sprinklesDonut = new Donut("Sprinkles");
		Donut trashDonut = new Donut();

		donutList.add(jellyFilled);
		donutList.add(mapleBar);
		donutList.add(glazedDonut);
		donutList.add(sprinklesDonut);
		donutList.add(trashDonut);
	}
	
	private void changeTheList()
	{
		display.displayText("The list is this big: " + donutList.size());
		
		Donut removed = donutList.remove(0);
		
		//The donut in index is stored in the "removed" variable and can be added back in
		
		display.displayText(removed.getFlavor() + " was removed from the list");
		display.displayText("Now it is this big: " + donutList.size());
		donutList.add(removed);
		
		display.displayText("The list is still contains: " + donutList.size() + " items");
		removed = donutList.set(3, new Donut());
		display.displayText("The donut with flavor " + removed.getFlavor() + " has been removed");
	}
	
	private void practiceMessingWithTheList()
	{
		display.displayText(donutList.get(3).toString());
		
		//.get shows you what's in that index
		
		Donut eliminated = donutList.remove(1);
		
		//.remove deletes that index and shrinks the list
		
		display.displayText(eliminated.getFlavor() + " has been eaten and is no longer in the list");
		
		donutList.add(4, eliminated);
		
		//.add adds into that index or at the end
		
		display.displayText(donutList.get(4) + " was added to the list");
		
		display.displayText("The list is " + donutList.size() + " donuts long");
		
		Donut deleted = donutList.remove(0);
		display.displayText(deleted + " was removed from the list");
		
		display.displayText(donutList.toString());
		
		//.toString() is needed to print the list
		
		Donut jellyFilled = new Donut("Jelly Filled");
		Donut sprinkles = new Donut("Sprinkles");
		
		donutList.add(2, jellyFilled);
		donutList.add(4, sprinkles);
		
		display.displayText("We added a " + donutList.get(2).getFlavor() + " donut to the list and a " + donutList.get(4).getFlavor() + " donut to the list");
		
		display.displayText(donutList.subList(0, 6).toString());
		
		String favoriteDonut = "Maple Bar";
		for(int index = 0; index < donutList.size(); index += 1)
		{
			display.displayText(donutList.get(index).toString());
			String currentFlavor = donutList.get(index).getFlavor();
			
			if(currentFlavor.equals(favoriteDonut))
			{
				for(int woop = 0; woop < 5; woop += 1)
				{
					display.displayText("THIS IS MY FAVORITE DONUT EVER!!!");
					for(int currentLetterIndex = 0; currentLetterIndex < currentFlavor.length(); currentLetterIndex += 1)
					{
						display.displayText(currentFlavor.substring(currentLetterIndex, currentLetterIndex + 1));
					}
				}
			}
			else
			{
				display.displayText("That is a good donut");
			}
		}
		
		display.displayText("I really Like donuts");
		
		Donut creamFilled = new Donut("Cream Filled");
		donutList.add(creamFilled);
		
		display.displayText(donutList.get(7).getFlavor() + " donut was added to the list");
		display.displayText("Now we have " + donutList.size() + " donuts!!!!!");
	}
	
	public int maxLength(ArrayList<String> myList)
	{
		int max = 0;
		
		for (int index = 0; index < myList.size(); index += 1)
		{
			if (max < myList.get(index).length())
			{
				max = myList.get(index).length();
			}
		}
		
		return max;
	}
	
	public String longestString(ArrayList<String>myList)
	{
		String longest = "";
		int max = 0;
		
		for (int index = 0; index < myList.size(); index +=1)
		{
			if (index < myList.get(index).length())
			{
				max = myList.get(index).length();
				longest = myList.get(index);
			}
		}
		
		return longest;
	}

	public ArrayList<Donut> getDonutList()
	{
		return (ArrayList<Donut>) donutList;
	}
	
	public PopupDisplay getDisplay()
	{
		return display;
	}
}
