/**
*	Author: Jason
*	Date : Nov 18, 2013
*	Description : 
*
*	Project Euler Problem 5
*	http://projecteuler.net/problem=5
*
*	Finds the least common multiple using Euclid's Algorithm 
*	for the greatest common divisor.
*
*	gcd(int x, int y) uses recursion
*	nonRecursiveGcd(int x, int y) uses a while loop and subtraction
*
*	Typically, the recursive method is faster, executing in ~4000 nanoseconds, 
*	while the non-recursive method executes in 9-12 milliseconds.
*/

package com.jason.euler.implementation;

import com.jason.euler.EulerInterface;

public class Euler5 implements EulerInterface {

	public int 	recurseCounter = 0,
					loopCounter = 0;
	
	@Override
	public void eulerInit() {
		int[] nums = {20, 19, 18, 17, 16, 15, 14, 13, 12, 11};
		int multiple = lcm(nums[0], nums[1]);
		
		long start = System.nanoTime();
		
		for (int i = 2; i < nums.length; i++) {
			multiple = lcm(multiple, nums[i]);
		}
		
		long elapsed = System.nanoTime() - start;
		String time;
		
		if (elapsed > 1000000) {
			elapsed /= 1000000;
			time = elapsed + "milliseconds\nLoopCounter: " + loopCounter;
		} else
			time = elapsed + "nanoseconds\nRecursion Counter: " + recurseCounter;
		
		System.out.println("Least Common Multiple: " + multiple + "\ncalculated in " + time);
	}
	
	//recursive implementation of Euclid's Algorithm to 
	//find the GCD of two numbers
	private int gcd(int x, int y) {
		recurseCounter++;
		return (y == 0) ? x : gcd(y , x % y);
	}
	
	//linear implementation of Euclid's Algorithm, typically executes
	//much slower than the recursive method.
	private int nonRecursiveGcd(int x, int y) {
		while (x != y) {
			loopCounter++;
			if (x > y)
				x -= y;
			else
				y -= x;
		}
		
		return x;
	}
	
	//Finds the least common multiple between two integers using
	//the greatest common divisor method
	private int lcm(int x, int y) {
		//return x * y / (gcd(x, y));
		return x * y / (nonRecursiveGcd(x, y));
	}

}

