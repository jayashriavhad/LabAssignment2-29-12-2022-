/* WAP where you take input of Two numbers (i,j)
from the user and divide the first number with second number include Exception handling mechanism.
*/

package com.ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandlingExample {

	public static void main(String[] args) 
	{
		
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the value of i is: ");  
         int i=sc.nextInt();
         System.out.println("Enter the value of j is ");
         int j=sc.nextInt();
         
         int ans;
         try   // use for the exception handling mechanism
         {
        	 ans=i/j;
        	 System.out.println("Division is : "+ans);
         }
         catch(Exception e)
         {
        	 System.out.println(e);
         }
        
   	}

}
