package main;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		
		System.out.println("Please enter a word to check to see if it is a Palindrome or q to quit:");
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			String rawEntry;
		
			// read String into var
			rawEntry = scan.nextLine();
			// ignore case
			String entry = rawEntry.toLowerCase();
			
			// if nothing was inputted
			if(rawEntry.length()==0) {
				System.out.println("no input. try entry again:");
			}
			// if String is a 'q' quit program	
			else if(entry.equals("q")) {
				System.out.println("Goodbye!");
				break;
			}
			
			// if String is Palindrome, say that
			else if(checkPal(entry)) {
				System.out.println(rawEntry + " is a Palindrome!");
				System.out.println("Enter 'q' to end program or another word:");
			}
			
			// if not Palindrome, say that
			else {
			System.out.println(rawEntry + " is not a Palindrome!");
			System.out.println("Enter 'q' to end program or another word:");
			}
			
		}
		scan.close();
		
	}
	/*
	 * checks if a string is a palindrome
	 * takes String entry
	 * returns boolean
	 * in method to save space up top
	 * 
	 * O(n)
	 * 
	 */
	private static boolean checkPal(String entry) {
		int half = entry.length() / 2;
		// first char
		int left = 0;
		// last char
		int right = entry.length()-1;
		boolean rtn = false;
		
		for (int i=0; i<=half; i++) {
			// check characters at left / right pointer
			if (entry.charAt(left)==entry.charAt(right)) {
				rtn = true;
			}
			else {
				rtn = false;
				break;
			}
			// move pointers towards middle
			left++;
			right--;
		}
		return rtn;
	}

}
