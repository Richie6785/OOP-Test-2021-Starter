package ie.tudublin;


import java.util.ArrayList;


import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{
	
	ArrayList<String> note = new ArrayList<String>();{
     note.add("A");
	 note.add("F");
	 note.add("G");
	 note.add("G");
	 note.add("G");

}
ArrayList<String> duration = new ArrayList<String>();{
duration.add("2");
duration.add("2");
duration.add("1");
duration.add("1");
duration.add("1");


}

ArrayList<String> type = new ArrayList<String>(); {
	type.add("Crotchet");
	type.add("Crotchet");
	type.add("Quaver");
	type.add("Quaver");
	type.add("Quaver");

}



	String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";
	

	void printScores()
	{
   println(type, duration, note);

	}

	public void settings()
	{
		size(1000, 500);

		// How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48) 
		println(i);
	}

	public void setup() 
	{
	
	}

	public void draw()
	{
		background(255);
		
	}

	void drawNotes()
	{


	}
}
