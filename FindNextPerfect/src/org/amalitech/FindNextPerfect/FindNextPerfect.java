package org.amalitech.FindNextPerfect;

public class FindNextPerfect {

	public static void main(String[] args) {
		
		// this is a simple program that finds the next perfect square
		
		//passing the value 121 to the findnextperfect method
		findNextPerfect(121);
		//passing the value 625 to the findnextperfect method
		findNextPerfect(625);
		//passing the value 114 to the findnextperfect method
		findNextPerfect(114);
	}
	
	static void findNextPerfect(int number) {
		double rslt =  Math.sqrt(number);
		if ((rslt - Math.floor(rslt)) == 0) {
			int result = (int) rslt;
			result = result +1;
			System.out.println("findNextSquare("+ number + ")" +" --> returns " + result*result);
		}
		else{
			System.out.println("findNextSquare("+ number + ")" +" --> returns " + "-1 since "+ number + " is not a perfect");	
			}
 }
	}

	

