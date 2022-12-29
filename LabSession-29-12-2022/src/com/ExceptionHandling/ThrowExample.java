/* WAP take a input of age from the user if the age is above 18 print 'You are eligible to vote'
else throw an Exception That 'Age is not Correct'
*/

package com.ExceptionHandling;
import java.util.Scanner;

public class ThrowExample {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age of person");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("You are eligible to vote");
		}
		else
		{
			 throw new ArithmeticException("Age is Not correct");// it is use to the throw an Exception
		}
		
	}

}
