package com.Beck.SimplRPG;

import java.util.Scanner;

public class SimpleRPG {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//***Notice: This is --VERY-- inefficient. Designed to teach java basics.**		
//It is designed so that 3 or 4 rooms can be created.
		
//Declare variables
		String[] exits = new String[6];
//End Variable Declaration
		
//**Simple Character
		BasicPlayer me = new BasicPlayer(100, 100, 1, 100, 1);
//**END Simple Character		
		
		
		// ****ROOM CREATION
		//Let's create three rooms within the main loop
		//first let's create an array holding the exits
		
		//Begin Room 1
		int[] room1exits = new int[6];
		//index 0 holds a value of 2
		room1exits[0] = 2;
		//index 1 holds a value of 3
		room1exits[1] = 3;
		//index 2-5 hold values of 0
		room1exits[2] = 0;
		room1exits[3] = 0;
		room1exits[4] = 0;
		room1exits[5] = 0;
		//Room Description
		String room1description = "This is the town square. You see a statue of Maxwell Reeves holding Mr. Beck's popcorn.";
		//Room Title
		String room1title = "Town Square";
		//Room index value
		int room1index = 1;
		//create an instance of 'BasicRoom' called room1
		BasicRoom room1 = new BasicRoom(room1title, room1description,room1index, room1exits);
		//End Room 1
		
		//Begin Room 2
				int[] room2exits = new int[6];
				room2exits[0] = 0;
				room2exits[1] = 1;
				room2exits[2] = 0;
				room2exits[3] = 0;
				room2exits[4] = 0;
				room2exits[5] = 0;
				//Room Description
				String room2description = "You are North of the Town Square. ";
				//Room Title
				String room2title = "North of the Town Square";
				//Room index value
				int room2index = 2;
				//create an instance of 'BasicRoom' called room1
				BasicRoom room2 = new BasicRoom(room2title, room2description,room2index, room2exits);
		//End Room 2
				
		//Begin Room 3
				int[] room3exits = new int[6];
				room3exits[0] = 1;
				room3exits[1] = 0;
				room3exits[2] = 0;
				room3exits[3] = 0;
				room3exits[4] = 0;
				room3exits[5] = 0;
				//Room Description
				String room3description = "You are South of the Town Square. ";
				//Room Title
				String room3title = "Town Square";
				//Room index value
				int room3index = 3;
				//create an instance of 'BasicRoom' called room1
				BasicRoom room3 = new BasicRoom(room3title, room3description,room3index, room3exits);
		//End Room 3
		
			//**END ROOM CREATION	
		
//Begin Game_Loop
		while(true)
				{
		int myroom = me.RoomNow();
		
		//Check for player's room number and print the info associated with that room
		//Check for room 1
		if (myroom == 1)
		{    
			
		    exits = room1.GetExits();
				
		
		System.out.println(room1.roomname);
		System.out.println(room1.roomdesc);
		System.out.println("Exits from here are:");
		
		for(int i = 0; i< exits.length; i++)
		{
		
			System.out.println(exits[i]);
			
		}
		
		
		}
		//End Room 1 Check
			
		Scanner scanme = new Scanner(System.in);
		String whatdo = scanme.next();
		 
		if(whatdo.equals("north"))
		     {	 
			//Check to see what the player is in
			
			//CHECK TO SEE IF WE ARE IN ROOM 1
			if (me.roomstandingin == room1.indexvalue)
			{
			
			//change the value of roomstandingin if there is an exit available. 
		    //if movenorth() returns 0, print "there is no exit in that direction"
			if(room1.movenorth() != 0)
			{
				me.roomstandingin = room1.movenorth();
			}
			else
			{
				System.out.println("There is no exit in that direction");
			}
	
			}
			//END ROOM 1 NORTH MOVE CHECK
			
						
			
			//END 'north' check	
		     }
		
      //END WHILE(TRUE) loop
		}
	
	//END main method	  
    }

//End Class Body
}

	
	
