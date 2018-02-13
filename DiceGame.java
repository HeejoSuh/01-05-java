/****************************************************************************
 *
 * Created by: Heejo Suh
 * Created on: Feb 2018
 * Created for: learning
 * 
 * This program will generate a random number between 1 and 6. 
 * It will then ask the user to guess the number and will keep track of the 
 * 	number of guesses until the user gets the right answer. 
 * It will then tell the user how many guesses it took
 *     
 *
 ****************************************************************************/



//have to import the following:
import java.util.Scanner;
import java.util.Random;

//****************************************************************************
public class DiceGame {

    public static void main(String[] args) {
    	//Get time required to microwave different types and numbers of snacks
    	
    	//set up a scanner to get the response from the user
    	Scanner scanner = new Scanner(System.in);
    	
    	//set variables to a default
    	
    	String input = null;
    	int diceNumber, guessCount= 0, guessedNumber;
    	
    	//roll the dice
    	Random rand = new Random();
    	diceNumber= rand.nextInt(6) + 1;
    	//6 is the maximum and the 1 is the minimum 
    	System.out.println("Dice rolled!\n");
        
       	//----------------------------------------------------------------
        //while appropriate response has not been collected
       //use while-true functions to break out of
	//get snack type
    	while (true) {
    		//keep asking for input
    		System.out.println("Guess the number: ");
		
    		//Get input as a string value-----
    		input = scanner.nextLine();
    		//check if number
    		try {
       			//check if response if a number
       			guessedNumber = Integer.parseInt(input);//Convert string to integer
    			
       			//if count is correct value
       			if (guessedNumber>=1 && guessedNumber<=6 ){
       				//check if correct input
       				if (guessedNumber==diceNumber){
       					System.out.println("Correct!\nWrong tries: " + guessCount);
       					break;
       				}else {
       					//incorrect guess
       					guessCount= guessCount+1;
       					System.out.println("Try again!");
       				}

       			}else {
       				System.out.println("Try again with a valid number!");
       			}
       			
       		} catch (NumberFormatException stringInput) {
       			//if not number then
       			System.out.println("Try again with a number!");
       		}
    		
    	}//closing for while
    	
	    		
    			
    
    }//closing for public main
}//closing for public class DiceGame