package useful.controller;

import java.util.List;
import java.util.ArrayList;
import useful.model.Donut;
import useful.view.PopupDisplay;

public class ToolController
{
	//Declares the list < > is needed
	
	private List<Donut> donutList;
	private PopupDisplay display;
	
	//Constructor needed
	
	public ToolController()
	{
		donutList = new ArrayList<Donut>();
		display = new PopupDisplay();
	}
	
	public void start()
	{
		Donut temp = new Donut();
		
		donutList.add(temp);
		
		fillTheList();
		showTheList();
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
		Donut jellyFilled = new Donut("jelly filled");
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
}
