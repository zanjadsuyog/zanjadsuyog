package BAsicTest5;

public class Cricketer {

//  Create a java class Cricketer. Class has int playerid, String name , 
//  Boolean isBaller , float strikerate , int runs. All fields are private. 
//  Write getter setter for all fields of this class.

	private int playerid;
	private String name;
	private boolean isballer;
	private float strikrate;
	private int run;

	public int getPlayerid() {
		return playerid;
	}

	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getisIsballer() {
		return isballer;
	}

	public void setIsballer(boolean isballer) {
		this.isballer = isballer;
	}

	public float getStrikrate() {
		return strikrate;
	}

	public void setStrikrate(float strikrate) {
		this.strikrate = strikrate;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}

	@Override
	public String toString() {
		return "Cricketer [playerid=" + playerid + ", name=" + name + ", strikrate=" + strikrate + ", run=" + run + "]";
	}
	
	

}
