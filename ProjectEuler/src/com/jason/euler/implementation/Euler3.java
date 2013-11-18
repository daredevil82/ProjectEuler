/**
*	Author: Jason
*	Date : Nov 18, 2013
*	Description : 
*
*	Project Euler Problem 3
*	http://projecteuler.net/problem=3
*
*	Find the largest factor for a given number.
*
*	This implementation uses basic factorization using a modulo.  There is
*	a refinement on the loop termination that since no number has divisors less 
*	than or equal to i, it cannot have a divisor which is greater than or 
*	equal to i.
*/

package com.jason.euler.implementation;

import com.jason.euler.EulerInterface;

public class Euler3 implements EulerInterface {

	@Override
	public void eulerInit() {
		
		long 	limit = 600851475143L,
				nums = limit;
		
		int		factor = 0;
		
		for (int i = 2; i < nums / i; i++) {
			while (nums % i == 0) {
				factor = i;
				nums /= i;
			}
		}
		
		if (nums > 1)
			factor = (int)nums;
		
		System.out.println("Largest factor for " + limit + ":\t" + factor);
		
	}

}

