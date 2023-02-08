
//WAP take 2 String as Input from user and find if both the Strings are same or not.

package StringEx22122022;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringEx {
	public static void main(String args[])
	   {
		   try
			 {
				  
				 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));// it will take the input in to the user
				 String str1,str2;
				 System.out.println("Enter the First name: ");//give the first string into the user
				 str1=br.readLine();
				 System.out.println("Enter the Second name: ");//give the first string into the user
				 str2=br.readLine();
			 
				 System.out.println("First String :"+str1);//print the First string
				 System.out.println("Second String:"+str2);//print second string
			 
			 if(str1.equals(str2) )//if it is check String is equal or not
			 {
				 System.out.println("Both string are Same");
				 
			 }
			 else
			  {
				 System.out.println("Both string are different");
		      }
			 }
			 catch(Exception e)
				 {
				   System.out.println(e);
				 }
		  
	    }

}
