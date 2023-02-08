
//Take a String from user and reverse it and also convert the same String to UpperCase.
package StringEx22122022;
import java.util.Scanner;

public class StringReverse
{
		public static void main(String args[])
		{
			Scanner SC = new Scanner(System.in);// give the input into the user by using scanner method
			
			System.out.println("Enter the String:");////give the string into the user
			String str= SC.nextLine();
		
			StringBuilder SB= new StringBuilder();
			SB.append(str);
			SB.reverse();//reverse the string
			
			System.out.println("Reverse String : "+SB);
			
			System.out.println("Uppercase of String"+str.toUpperCase());//it is convert the string into the upper casse
			
		}

}
