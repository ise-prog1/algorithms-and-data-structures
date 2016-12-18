package enums;

/**
 * Enums are a special type of class 
 * that represent a closed range of values defined at compile time
 */
public enum TransportType {

	NONE("----"),
	PKW("PKW"),
	LKW("Lastkraft"),
	BUS("100"),
	BAHN("RE7"),
	SBAHN ("S1"),
	UBAHN ("U9"),
	HELIKOPTER ("Privater Heli");
	
	/*
	 * Instance variables are allowed and possible
	 */
	private String name; 
	/**
	 * Constructor for enums are required to be private!
	 * @param name
	 */
	private TransportType(String name) {
		this.name = name;
	}
	
	public String toString() {
		// ordinal() is a special method
		// that returns the index of a given value
		// it starts at 0 just like Arrays
		return this.ordinal() + " "+  this.name;
	}
	
	public static TransportType fromOrdinal(int input) {
		// values() is a special method
		// that returns all the possible Enum values as an Array
		return values()[input];
	}
	
	
}
