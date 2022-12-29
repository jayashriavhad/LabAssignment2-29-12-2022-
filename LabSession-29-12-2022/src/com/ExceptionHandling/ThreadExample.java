// Create Thread to find if the number is Even or odd

package com.ExceptionHandling;

import java.util.Scanner;

public class ThreadExample {

	public static void main(String[] args)
	{
		MyThread mt=new MyThread();
		mt.start();  // call the start method 
	}

}

class MyThread extends Thread  // creating thread  using extends class Thread
{ 
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int no=sc.nextInt();
		
	     if(no%2==0)
	     {
	    	 System.out.println("Nuber is Even");
	     }
	     else
	     {
	    	 System.out.println("Number is Odd");
	     }
	}
}