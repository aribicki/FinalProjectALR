package edu.saintjoe.cs.aribicki.mammal;

	// Brian Capouch commenting a subclass of Attr, called ColorAttr
	public class Human extends Mammal {
		
		
		// myColor is an ADDITIONAL data member of the ColorAttr class
		private NumberFeet myFeet; // The decoded color

		// Constructor No 1
		// This constructor takes a name and an Object value
		public Human(String name, String value, String talk) {
			// super means call the parent class constructor
			// Note that: the parent class MUST have a constructor
			// with the indicated signature (e.g. name, value)
			// Below line is the same as writing Attr(name,value)
		    super(name, value, talk);
		    // System.out.println("C1");
		    decodeFeet();
		    }

		// constructor No 2
		// This constructor takes a name only
		public Human(String name) {
			// Call the ColorAttr constructor which mathches the parameters
			//  in the same order and type
		    this(name, "unknown");
		    // System.out.println("C2");
		    }

		// constructor no 3
		// This constructor takes a name and a ScreenColor value
		public Human(String name, NumberFeet value) {
		    super(name, value.toString());
		    //System.out.println("C3");
		    myFeet = value;
		    }
		 public Human(String talk) {
		 	this(talk, "IDK")
		 }   

		// THIS is an example of method overriding!!!!!!!!!
		public String setValue(String newValue)  {
			    // do superclass stuff first
			    String retval = super.setValue(newValue);
			    decodeFeet();
			    return retval;
			    }

		/** Set value to ScreenColor, not description */
		public NumberFeet setValue(NumberFeet newValue) {
			// do superclass first
			super.setValue(newValue.toString());
			NumberFeet oldValue = myFeet;
			myFeet = newValue;
			return oldValue;
			}

		  /** Return decoded ScreenColor object */
		  public NumberFeet getFeet() {
			    return myFeet;
			    }

		  /** Set ScreenColor from description */
		  protected void decodeFeet() {
			  if(getValue() == null) {
				  System.out.println("Freakout!!");
				  myFeet = null; }
			  else
				  myFeet = new ScreenColor(getValue());
		  		  }
		  public String toString() {
			  return super.toString() + " " + myFeet.toNumberString();
		  }
	}
