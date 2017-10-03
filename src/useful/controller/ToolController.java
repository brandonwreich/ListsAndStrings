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
		for(int index = 0; index < donutList.size(); index += 1)
		{
			display.displayText(donutList.get(index).toString());
		}
	}
	
	private void fillTheList()
	{
		Donut jellyFilled = new Donut("jelly filled");
		Donut mapleBar = new Donut("Maple Bar");
		Donut glazedDonut = new Donut("Glazed");
		Donut sprinklesDonut = new Donut("Plain");
		Donut trashDonut = new Donut();

		donutList.add(jellyFilled);
		donutList.add(mapleBar);
		donutList.add(glazedDonut);
		donutList.add(sprinklesDonut);
		donutList.add(trashDonut);
		
	}
}
