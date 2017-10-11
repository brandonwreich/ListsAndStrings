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
		
		Donut eliminated = donutList.remove(1);
		display.displayText(eliminated.getFlavor() + " has been eaten and is no longer in the list");
		
		donutList.add(4, eliminated);
		display.displayText(donutList.get(4) + " was added to the list");
		
		display.displayText("The list is " + donutList.size() + " donuts long");
		
		Donut deleted = donutList.remove(0);
		display.displayText(deleted + " was removed from the list");
		
		display.displayText(donutList.toString());
		
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
				for(int woop = 0; woop < 10; woop += 1)
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

	public ArrayList<Donut> getDonutList()
	{
		return (ArrayList<Donut>) donutList;
	}
	
	public PopupDisplay getDisplay()
	{
		return display;
	}
}
