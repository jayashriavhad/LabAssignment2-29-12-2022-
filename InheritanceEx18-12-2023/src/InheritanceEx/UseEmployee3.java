
/*create a class Employee with a method where you take the name address and experience of the employee.
 make a child class programmer which has a method to take the personal details but also has a field programming
language project manager with same details but instead of programming language it takes no of projects class*/

package InheritanceEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class  Employee
{   
    String name; 
    String Address;
    int Experience;
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));// take the input into the user
	public void print() throws IOException 
		{
		  
		System.out.println("Enter the Employee name");//give the Employee name in user
		name=br.readLine();
		
		System.out.println("Enter the Employee Address");//give the Employee Address in user
		Address=br.readLine();
		
		System.out.println("Enter the Employee Experience");//give the employee Experience in user
		Experience=Integer.parseInt(br.readLine());// it convert the integer
	  }
	  
}

class Programmer extends Employee  // create a new class and extend the employee class
{
	String Lang;
    public void print1() throws NumberFormatException, IOException
   {
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));// take the input into the user
 
     System.out.println(" Enter Employee working programing language");
 	  Lang=br.readLine();
   }
   public void add()// create a method
   { 
       System.out.println("Employee name is "+name);// print the name,add,experience,lang
	   System.out.println("Employee Address is "+Address);
       System.out.println("Employee Experience is "+Experience);
	   System.out.println("Employee working programing lang  is "+Lang);
	   
   }
   
 }
class ProjectManager  extends Employee // create a new class and extend the employee class
{
	 int noofProject;
	 String Lang;
   public void print2() throws NumberFormatException, IOException //create a method
  {
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));// take the input into the user
      System.out.println("Enter the number of project");
	  noofProject=Integer.parseInt(br.readLine());
	  
   }
   public void  get() // create a method
   {
	   System.out.println("Employee number of project is "+noofProject); //print the number project
   }
   
}
class UseEmployee3
{
  public static void main(String args[])throws Exception
  {
    ProjectManager p=new ProjectManager();//create a  object in projectmanager class
	Programmer p1=new Programmer(); //create a  object in programer class
	p1.print();//  call print method
	p1.print1();// call print1 method
	p.print2();// call print2 method
	p1.add();//call add method 
	p.get();//call get method
   }
}