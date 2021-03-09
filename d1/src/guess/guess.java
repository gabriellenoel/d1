package guess;
import java.util.Scanner;
import java.util.Random; 
import java.lang.Math;

public class guess {

	public static void main(String[] args) {
		Random rand = new Random(); 
		int randomNum = rand.nextInt(101);
		
		for (int i=0; i<5; i++) {
		Scanner myObj = new Scanner(System.in); // create scanner
		System.out.println("Guess A Number (1-100):");
		
		int guessNum = myObj.nextInt(); // read user input
		boolean guessed = false;
		System.out.println("Guess is: " + guessNum); // print output
	
	if (Math.abs(guessNum-randomNum)<=10) {
		guessed = true;
		break;
	}
	else {
		if (i<4) {
			System.out.println("Guess Again. :(");
		}
	}
		}
	
	System.out.println("The number was " + randomNum);
		
	}
	
}
