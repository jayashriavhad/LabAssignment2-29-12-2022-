
//WAP take 2 string as input from user and find if first String exits in another
package StringEx22122022;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringExits {
		public static void main(String args[])
		  {
		  try
		   {
			   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));// give the input into the user by using bufferedreader method
			   String s1,s2;
			   System.out.println("Enter the First String: ");//give the first string into the user
			   s1=br.readLine();
			   System.out.println("Enter the Second String: ");//give the second string into the user
			   s2=br.readLine();
			   
			   System.out.println("First String :"+s1);//print first string
			   System.out.println("Second String:"+s2);//print second string
		    
			if(s1.contains(s2))// if it is check the string is already exit or not
			{
				System.out.println("yes,First String exits in another");
				
		    }
			else
			{
				System.out.println("No,First String exits in another");
			}
			}
		   catch(Exception e)
			   {
				System.out.println(e);
			   }
		  }

	}

