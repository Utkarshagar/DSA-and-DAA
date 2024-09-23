package java_project.codingblocksAssi1; 
import java.util.*;
public class generate_binary_string
{ 
    public static void main (String[] args)
	{
        Scanner scanner =new Scanner(System.in);
        
		// Input binary pattern with wildcards
        int a=scanner.nextInt();
		String inputpattern =scanner.next();
		
		// Convert the string to a character array
		char[] pattern = inputpattern.toCharArray();
		
		// Generate and print all binary strings
		generateBinaryStrings(pattern, 0);
	}
	// Recursive function to generate all binary
	// strings formed by replacing each wildcard
	// character by 0 or 1 
	public static void generateBinaryStrings(char pattern[], int currentIndex)
	{
		// Base case: If the end of the pattern is reached
		if (currentIndex == pattern.length)
		{
			// Print the generated binary string
			System.out.print(pattern+" ");
			return;
		}

		// If the current character is a wildcard '?'
		if (pattern[currentIndex] == '?')
		{
			// Replace '?' by '0' and recurse
			pattern[currentIndex] = '0';
			generateBinaryStrings(pattern, currentIndex + 1);
			
			// Replace '?' by '1' and recurse
			pattern[currentIndex] = '1';
			generateBinaryStrings(pattern, currentIndex + 1);
			
			// NOTE: Need to backtrack as the string
			// is passed by reference to the function
			pattern[currentIndex] = '?';
		}
		else
			// If the current character is not a wildcard, continue with the next character
			generateBinaryStrings(pattern, currentIndex + 1);
	}

	// Driver code
	
}
