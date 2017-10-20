//Name: Tushar Shrivastav
//
//File Name: PalindromeTester.java
//
//Class Description: Driver class which will execute the logic in Palindrome.java, 
//prints out whether if it is a palindrome or not

//import statements 
import java.util.Scanner;
//driver for Palindrome
public class PalindromeTester {
	
	//main method
	public static void main(String[] args) {
	System.out.println("Welcome to the Palindrome Program! Enter the letter q when you are done.");
         
	//creating new Scanner object
        Scanner input = new Scanner(System.in);
        
	//ask for input
        System.out.print("Enter a string: "); 
	String str = input.nextLine();

	//while the string in the input is NOT q keep asking for more strings
	while ( !str.equals("q") )	
        {
		//creating new Palindrome object
        	Palindrome pal = new Palindrome(str);
				
        	if( pal.isPalindrome() )  // true
			    System.out.println(str + " is a palindrome");
			else					// false
			    System.out.println(str + " is not a palindrome");

        	System.out.print("Enter a string: "); 
			str = input.nextLine();
		}
        System.out.println("Exiting..."); 
        input.close();
	}
}
