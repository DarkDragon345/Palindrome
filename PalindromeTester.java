//import statements 
import java.util.Scanner;
//driver for Palindrome
public class PalindromeTester {

	public static void main(String[] args) {
		System.out.println("Welcome to the Palindrome Program! Enter the letter q when you are done.");
         
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: "); 
		String str = input.nextLine();
        while ( !str.equals("q") )	
        {
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
