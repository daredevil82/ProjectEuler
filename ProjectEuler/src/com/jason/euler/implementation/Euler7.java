/**
*	Author: Jason
*	Date : Nov 18, 2013
*	Description : 
*
*	Project Euler Problem 7
*	http://projecteuler.net/problem=7
*
*	Find the 10001st prime number
*/

package com.jason.euler.implementation;

import com.jason.euler.EulerInterface;

public class Euler7 implements EulerInterface {

	
	@Override
	public void eulerInit() {
		int 	count = 1,
				factor = 3;
		
		long start = System.currentTimeMillis();
		
		while (count < 10001) {
			if (isPrime(factor))
				count++;
			factor += 2;
		}
		
		long elapsed = System.currentTimeMillis() - start;
		
		System.out.println("Factor: " + (factor - 2) + "\nElapsed time: " 
							+ elapsed + " milliseconds");
		
	}
	
	private boolean isPrime(int num) {
		if (num == 2)
			return true;
		
		if (num % 2 == 0 || num == 1)
			return false;
					
		long limit = (long)Math.sqrt(num);
		
		for (int i = 3; i <= limit; i+= 2) {
			if (num % i == 0)
				return false; 
		}
		
		return true;
	}

}

