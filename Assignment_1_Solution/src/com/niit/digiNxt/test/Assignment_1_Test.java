package com.niit.digiNxt.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.niit.digiNxt.assignment1.NumberOperations;

public class Assignment_1_Test {

	private static NumberOperations numberOperations;

	@BeforeClass
	public static void init() {
		numberOperations = new NumberOperations();
	}

	@Test
	public void testThreeSpaces() {
		int number = 67238;
		int[] spaceAmongNumbers = numberOperations.getNumberInArray(number);
		assertNotNull(spaceAmongNumbers);
		System.out.println("-------testThreeSpaces----------");
		numberOperations.display(spaceAmongNumbers);
		
	}


	@Test
	public void testReverse() {
		int number = 67238;
		int[] spaceAmongNumbers = numberOperations.getNumberInArray(number);
		int []reverseArray=numberOperations.displayInAscendingOrder(spaceAmongNumbers);
		assertNotNull(spaceAmongNumbers);
		System.out.println("-------testReverse----------");
	   for(int i : reverseArray)
	   {
		   System.out.print(i+"   ");
	   }
	}
	@Test
	public void testSumOfOddDigits() {
		int number = 67238;
		int[] spaceAmongNumbers = numberOperations.getNumberInArray(number);
		int oddSum=numberOperations.findSumofOddDigits(spaceAmongNumbers);
		assertNotNull(spaceAmongNumbers);
		System.out.println("\n-------testSumOfOddDigits----------");
	   System.out.println(oddSum);
	}
	@Test
	public void testSumOfEvenDigits() {
		int number = 67238;
		int[] spaceAmongNumbers = numberOperations.getNumberInArray(number);
		int oddSum=numberOperations.findSumofEvenDigits(spaceAmongNumbers);
		assertNotNull(spaceAmongNumbers);
		System.out.println("\n-------testSumOfEvenDigits----------");
	   System.out.println(oddSum);
	}
	

}
