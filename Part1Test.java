package assignmentpart1;

public class Part1Test {
	public static void main(String[] args) {
		X[] xa;
		Y[] ya;
		
		
		// first question (a): can we assign xa to ya: NO, can we assign ya to xa: yes.
		// at compile time
		//xa = ya; // no compile time Error
		//ya = xa;// compile time error;
		// ya = (Y[]) xa// no compile time error
		
		// Second question ya reference an array of Y's
		ya = new Y[1];
		xa = ya;//no error
		ya = (Y[]) xa; // need a cast
		
		// third question 
		xa = new X[1];
		ya = (Y[]) xa; //run time error
		
		xa = new Y[1];
		ya = (Y[]) xa; 
		
		
	}
}
