package abstraction;
 
abstract class Bike
{
	public abstract void add();
	public void mul()
	{
		System.out.println("Orange");
	}
	}
abstract class Scooty extends Bike
{
	
		public abstract void sub();
		public void display()
		{
			System.out.println("Apple");
		}
	}
abstract class Car extends Scooty
{
	public abstract void show();
}
public class AbstractExample extends Car {
public void add()
{
	int a=5,b=6;
	int c=a+b;
	System.out.println(c);
	}
public void sub()
{
	System.out.println("hi");
}
public void show()
{
	System.out.println("live");
}
	public static void main(String[] args) {
	
		AbstractExample  obj=new AbstractExample ();
		obj.add();
		obj.sub();
		obj.show();
		obj.display();
		obj.mul();
		
	}

}
