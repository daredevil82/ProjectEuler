package com.jason.euler.implementation;

import com.jason.euler.EulerInterface;

/**
 * User: jason
 * Date: 1/13/14
 * Time: 3:12 PM
 * Description: Summation of all Prime Numbers below 2,000,000
 */
public class Euler10 implements EulerInterface {

	public void eulerInit(){

		long primeCount = 0; //need a long to hold the prime count, since it will be larger than an 4 byte int
		int primeLimit = 2000000;

		long startTime = System.currentTimeMillis();

		for (int i = 0; i < primeLimit; i++){
			if (isPrime(i))
				primeCount += i;
		}

		long elapsed = System.currentTimeMillis() - startTime;

		System.out.printf("Sum of primes under %d is:\t%d\n\nElapsed Time:\t%d milliseconds",
							primeLimit, primeCount, elapsed);

	}

	private boolean isPrime(int num){
		if (num == 2)
		    return true;

		if (num == 1 || num % 2 == 0)
			return false;

	   	long limit = (long) Math.sqrt(num);

		for (int i = 3; i <= limit; i += 2 ){
			if (num % i == 0)
				return false;
		}

		return true;

	}


}

