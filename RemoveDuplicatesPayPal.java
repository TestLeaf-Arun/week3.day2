package week3.day2;
import java.util.LinkedHashSet;
import java.util.Set;
public class RemoveDuplicatesPayPal {

	public static void main(String[] args) {
		
		String text = "PayPal India";
		String text1 = text.toLowerCase();
	 	String text2 = text1.replaceAll("\\s","");
		
	 // Convert it into Character Array
		char[] charArray = text2.toCharArray();
		
	 // Declare a Set as charSet for Character
		Set<Character> charSet = new LinkedHashSet<Character>();
		
	 // Declare a Set as dupCharSet for duplicate Character
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
		
		for (char c : charArray) {
			boolean unique = charSet.add(c);
			
		 //	if the character is already in the charSet then add it to the dupCharSet
			if (unique == false) {
				dupCharSet.add(c);
			}
	 	}
		System.out.println("Duplicate Characters: " + dupCharSet);
		System.out.println("Character Set after removing duplicates: " + charSet);
	}
}