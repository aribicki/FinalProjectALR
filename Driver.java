package edu.saintjoe.cs.brianc.attr;

public class Driver {
	
	public static void main(String[] args ) {
		
		Human testOne, testTwo, testThree;
		Attr testFour;
		
		// We need this object for the third ColorAttr constructor
		ScreenColor newColor = new ScreenColor("green");
		
		// Test out our constructors
		
		// Number one
		testOne = new Human("ColorOne","red");
		System.out.println(testOne.toString());
		
		// Number two
		testTwo = new Human("ColorTwo");
		System.out.println(testTwo.toString());
		
		// Number three
		testThree = new Human("ColorThree", newColor);
		System.out.println(testThree.toString());
	
		// Number four
		testFour = new Mammal("ColorFour", "yellow");
		System.out.println(testFour.toString());
		
	} // end main
}
