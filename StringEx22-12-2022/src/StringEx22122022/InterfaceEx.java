/*WAP create 2 interfaces "Printable" and "Calculate" and use these 2 interfaces in 2 classes one will
  calculate square and another will calculate cube.*/

package StringEx22122022;


	interface Printable//create the interface
	{
		void displaySC();// create on abstract method displaySC
	}
	class Square implements Printable//create a class is implement the interface
	{
		public void displaySC() // abstract method body
		{
			System.out.println("Square of a number is : ");
		}
		public int cal(int n)// normal method
		{
			return n*n;
		}
	}
	interface Calculate// again create one interface
	{
		int cal(int n);//create a abstract method
	}
		
	class Cube implements Calculate //create a class is implement the interface
	{
		public void displaySC() // abstract method body
		{
			System.out.println("Cube of a number is : ");
		}
		public int cal(int n)// normal method 
		{
			return n*n*n;
		}
	}

	public class InterfaceEx //create a class
	{
		public static void main(String[] args) 
		{
			Square sq = new Square(); //create the object in class
			sq.displaySC();
			System.out.println(sq.cal(5));
			
			Cube c = new Cube();
			c.displaySC();
			System.out.println(c.cal(5));
		}
  	}
