package edu.saintjoe.cs.aribicki.mammal;

public class Driver {
	
	public static void main(String[] args ) {
		
		Human testOne, testTwo, testThree;
		Attr testFour;
		
		// We need this object for the third ColorAttr constructor
		NumberFeet myFeet = new NumberFeet("two");
		
		// Test out our constructors
		
		// Number one
		testOne = new Human("HumanOne","Two");
		System.out.println(testOne.toString());
		
		// Number two
		testTwo = new Human("HumanTwo");
		System.out.println(testTwo.toString());
		
		// Number three
		testThree = new Human("HumanThree", newFeet);
		System.out.println(testThree.toString());
	
		// Number four
		testFour = new Mammal("HumanFour", "Four");
		System.out.println(testFour.toString());
		
	} // end main
}
