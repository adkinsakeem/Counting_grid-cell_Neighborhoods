package gridCell_neighborhoods;

@SuppressWarnings("serial")
public class EnteredValueException extends Exception{
	
	public EnteredValueException(String message) {
		System.out.println("There was an issue with one of the values entered: ");
		System.out.println("~~ " + message + " ~~");

	}

}
