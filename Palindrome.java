//Name: Tushar Shrivastav
//
//File Name: Palindrome.java
//
//Class Description: implements the palindrome object and behavior
public class Palindrome { 
	String str ;

	//Constructor
	public Palindrome(String palstr)
	{
		str = stripLower(palstr) ;
	}
	//public method to check if the object palindrome is a palindrome or not
	public boolean isPalindrome() {
		if (str.length() == 1)
			return false ;
		return isPal(str) ;
	}
	/*private method for class to check if the string initialized during the 
	constructor is a palindrome or not.
	Base Cases: if the length of str is less than 2 and if the character at 
	0th index is not equal to the character at the last index
	using recursion we call isPal to go from the outer bounds
	to the inner part of the strings and check if they are equal
	if at any point they are not the second base case will return false
	and therefore the string is not a Palindrome.
	*/
	private boolean isPal(String str)
	{
		if (str.length() < 2)
			return true ;
		if ( str.charAt(0) != str.charAt(str.length() - 1) )
				return false ;
		else
			return isPal(str.substring(1, str.length() - 1));
	}

	//removes all characters not non-alphanumeric characters AND converts the string into lowercase.
	public String stripLower(String str) {
		return	(str.replaceAll("[^A-Za-z0-9]", "")).toLowerCase();
	}
}
