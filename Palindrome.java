//Name: Tushar Shrivastav
//
//File Name: Palindrome.java
//
//Class Description: implements palindrome logic  
public class Palindrome { 
	
	public static boolean isPal(String str) {
        return str.length() <= 1 ||(str.charAt(0) == str.charAt(str.length() - 1) && isPal(str.substring(1, str.length() - 1)));
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