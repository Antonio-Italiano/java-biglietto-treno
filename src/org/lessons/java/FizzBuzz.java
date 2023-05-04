package org.lessons.java;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Quanti numeri vuoi stampare?");
		int max = in.nextInt();
		String result = "" ; 
		
		
		for(int i = 1; i <= max; i++) {
			if(i%15 == 0) {
				result = "fizzBuzz";
				System.out.println(i +result);
				
			} else if(i%5 == 0) {
				result = "Buzz";
				System.out.println(i +result);
				
			} else if(i%3 == 0) {
				result = "Fizz";
				System.out.println(i +result);
			} else {
				System.out.println(i);
			}
		}
		
		in.close();
	}
}
