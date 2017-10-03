package useful.controller;

import java.util.List;
import java.util.ArrayList;
import useful.model.Donut;

public class ToolController
{
	//Declares the list < > is needed
	
	private List<Donut> donutList;
	
	//Constructor needed
	
	public ToolController()
	{
		donutList = new ArrayList<Donut>();
	}
	
	public void start()
	{
		Donut temp = new Donut();
		
		donutList.add(temp);
	}
}
