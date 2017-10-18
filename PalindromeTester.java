//import statements 
import java.lang.Character;
import java.util.Scanner;
//driver for Palindrome
public class PalindromeTester {
	
	private static Scanner input;

	public static void main(String[] args) {
		System.out.println("Welcome to the Palindrome Program! Enter the letter q when you are done.");
		
        Palindrome pal = new Palindrome();
        String str;
        
        do{		
        
			System.out.println("Enter a string: "); 
			Scanner input = new Scanner(System.in);
			
			str = input.nextLine();
			
			String str2 = str;
			
			str2 = pal.stripLower(str);
			
			if(str.length() == 1){
					if(str.equals("q"))
						break;
				System.out.println(str + " is not a palindrome");
			}					
			else if(pal.isPal(str2) == true)
			    System.out.println(str + " is a palindrome");
			else
			    System.out.println(str + " is not a palindrome");

		 
        } while(!(str.equals("q")));
	}
}
