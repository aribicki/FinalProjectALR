package edu.saintjoe.cs.aribicki.mammal;


public class Mammal {
	
	// Once I create an object and give it a name, it CANNOT be changed!!
	private final String name;
	
	// "value" can be a reference to ANY kind of object!!
	private Object value = null;
	
	/* ---------------------------------------------------------------------- */

	// One-parameter constructor; I know the name, I don't know the value
	public Mammal(String name) {
		this.name = name;
	}

	// Two-parameter constructor; I know BOTH the name and the value
	public Mammal(String name, String value) {
		this.name = name;
	    this.value = value;
	    }

	// Accessor or "getter"
	public String getname() {
	    return name;
	    }

	// Accessor or "getter"
	public String getValue() {
	    return value;
	    }

	// Setter or mututator for data member "value"
	public String setValue(String newValue) {
	    String oldVal = value;
	    value = newValue;
	    return oldVal;
	    }

	// ALL classes should have a "toString" method to visualize their contents
	//   that usually means just printing their data members
	public String toString() {
	    return name + "='" + value + "'";
	    }
	}
