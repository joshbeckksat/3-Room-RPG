package com.Beck.SimplRPG;

public class BasicRoom {
	int[] exitnumbers = new int[6];
	int indexvalue = 0;
	String roomname = null;
	String roomdesc = null;
	
	public BasicRoom (String name, String desc, int index, int[] exits)
	{
		roomname = name;
		roomdesc = desc;
		indexvalue = index;
		for (int i =0; i< 5; i ++)
		{
			exitnumbers[i] = exits[i];
		}
	}
	
	//EXIT DIRECTIONS:
	//Each index position represents a direction
	//0 North
	//1 South
	//2 West
	//3 East
	//4 Up
	//5 Down
	
	public String[] GetExits()
	{
		//Declare a string array to hold exit values
		String[] exitnames = new String[6];
		
		//Iterate through the exit index values and check for non-zero values.
	      for (int i = 0; i < 6; i ++)
		{
			//if VALUE contained within the array --IS NOT-- zero, check the INDEX POSITION and return a STRING ARRAY.
			if (exitnumbers[i] != 0 )
			{
				if (i == 0)
				{
				exitnames[i] = "North";
				}   
				if (i == 1)
				{
					exitnames[i] = "South";
				}   
				if (i == 2)
				{
					exitnames[i] = "West";
				}   
				if (i == 3)
				{
					exitnames[i] = "East";
				}   
				if (i == 4)
				{
					exitnames[i] = "Up";
				}   
				if (i == 5)
				{
					exitnames[i] = "Down";
				}   
			}
			//END if statement
			
		}
	      //End For Statement
	      return exitnames;
	}
	
	public int movenorth()
	{
		return exitnumbers[0];
	}
	

}
