/**
*	Author: Jason
*	Date : Nov 18, 2013
*	Description : 
*
*	Project Euler Problem 4
*	http://projecteuler.net/problem=4
*
*	Test sequence to see which of the three common methods is most efficient.
*/

package com.jason.euler.implementation;

import com.jason.euler.EulerInterface;

public class Euler4 implements EulerInterface {

	@Override
	@SuppressWarnings("unused")
	public void eulerInit() {		
		
		long palindromeByIntStart = System.currentTimeMillis();
		int intPalindrome = timePalindromeByInt();
		long palindromeByIntEnd = System.currentTimeMillis() - palindromeByIntStart;
		
		long palindromeByStringStart = System.currentTimeMillis();
		int stringPalindrome = timePalindromeByString();
		long palindromeByStringEnd = System.currentTimeMillis() - palindromeByStringStart;
		
		long palindromeByStringBufferStart = System.currentTimeMillis();
		int stringBufferPalindrome = timePalindromeByStringBuffer();
		long palindromeByStringBufferEnd = System.currentTimeMillis() - palindromeByStringBufferStart;
		
		System.out.println("The largest palindrome is: " + intPalindrome);
		
		String output = "\nTested the efficiency of using\n\n" + 
						"Integer conversion:\t\t%10d\nString Conversion:\t\t%10d\nStringBuffer Conversion:\t%10d\n\nmilliseconds";
		
		System.out.printf(output, palindromeByIntEnd, palindromeByStringEnd, palindromeByStringBufferEnd);
		
	}
	
	private int timePalindromeByStringBuffer() {
		int		tempNum = 0,
				largestPalindrome = 0;
		
		for (int i = 100; i < 999; i++) {
			for (int j = i; j < 999; j++) {
				tempNum = i * j;
				
				if (isPalindromeByStringBuffer(tempNum) && tempNum > largestPalindrome)
					largestPalindrome = tempNum;
			}
		}
		
		return largestPalindrome;
	}
	
	private int timePalindromeByString() {
		int		tempNum = 0,
				largestPalindrome = 0;
		
		for (int i = 100; i < 999; i++) {
			for (int j = i; j < 999; j++) {
				tempNum = i * j;
				
				if (isPalindromeByString(tempNum) && tempNum > largestPalindrome)
					largestPalindrome = tempNum;
			}
		}
		
		return largestPalindrome;
	}
	
	private int timePalindromeByInt() {
		int		tempNum = 0,
				largestPalindrome = 0;
		
		for (int i = 100; i < 999; i++) {
			for (int j = i; j < 999; j++) {
				tempNum = i * j;
				
				if (isPalindromeByNumber(tempNum) && tempNum > largestPalindrome)
					largestPalindrome = tempNum;
			}
		}
		
		return largestPalindrome;
	}
	
	
	
	//checks if a number is a palindrome by converting to a string.
	private boolean isPalindromeByStringBuffer(int number) {
		String num = Integer.toString(number);
		
		return num.equals(new StringBuilder(num).reverse());
	}
	
	private boolean isPalindromeByString(int number) {
		char[] nums = Integer.toString(number).toCharArray();
		int 	start = 0,
				end = nums.length - 1;
		
		while (end > start) {
			if (nums[start] != nums[end]) 
				return false;
			
			end--;
			start++;
			
		}
		
		return true;
	}
	
	
	//Checks if a number is a palindrome using integers;
	private boolean isPalindromeByNumber(int number) {
		return (number == reverse(number)) ? true : false;
	}
	
	private int reverse(int n) {
		int 	i = 0,
				r = -1;
		
		while (n != 0) {
			r = n % 10;
			i = (i * 10) + r;
			n /= 10;
		}
		
		return i;
	}

}

