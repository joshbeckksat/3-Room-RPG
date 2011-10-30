package com.Beck.SimplRPG;

public class BasicPlayer {
	String name = null;
	int hitpoints = 0;
	int mana = 0;
	int level = 1;
	int gold = 0;
	int roomstandingin = 0;
	
	public BasicPlayer(int hp, int mp, int lvl, int gld, int roomnumber)
	{
		roomstandingin = roomnumber;
		hitpoints = hp;
		mana = mp;
		level = lvl;
		gold = gld;
	}
	
	public int RoomNow()
	{
		return roomstandingin;
	}
   
}
