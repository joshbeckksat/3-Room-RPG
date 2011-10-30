package com.Beck.SimplRPG;

public class BasicShop extends BasicRoom{
   //Shoptypes:
   //1 -- Sells Weapons
   //2 --Sells Armor
   //3 -- Buys All
	int shoptype = 0;
	public BasicShop(String name, String desc, int index, int[] exits, int type)
	{
		super(name, desc, index, exits);
		shoptype = type;
	}
	
	//Check to see if the shop sells weapons.
	public boolean SellsWeapons()
	{
		if (shoptype == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
