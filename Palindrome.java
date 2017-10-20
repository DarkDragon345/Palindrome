//Name: Tushar Shrivastav
//
//File Name: Palindrome.java
//
//Class Description: implements palindrome logic  
public class Palindrome { 
	String str ;
	
	public Palindrome(String palstr)
	{
		str = stripLower(palstr) ;
	}
	
	public boolean isPalindrome() {
		if (!validate(str))
			return false ;
		if (str.length() == 1)
			return false ;
		return isPal(str) ;
	}
	
	private boolean isPal(String str)
	{
		if (str.length() < 2)
			return true ;
		if ( str.charAt(0) != str.charAt(str.length() - 1) )
				return false ;
		else
				return isPal(str.substring(1, str.length() - 1));
    }


    public String stripLower(String str) {
        return  (str.replaceAll("[^A-Za-z0-9]", "")).toLowerCase();
    }
    
	public boolean validate(String str) {
		char charArray[] = str.toCharArray();
		
		for (int i = 0; i < charArray.length; i++){
			if ((charArray[i] >= 'a' && charArray[i] <= 'z') || (charArray[i] >= '0' && charArray[i] <= '9'))
				continue;
			else 
				return false;
		}
		return true;
	}
}