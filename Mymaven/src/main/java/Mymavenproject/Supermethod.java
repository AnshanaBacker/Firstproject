package Mymavenproject;

class Animal
{  
public void eat()
{
	System.out.println("eating...");
	}  
}  
class Dog extends Animal
{  
public void eat()
{
	System.out.println("eating bread...");
	}  
public void work()
{  
//super.eat();  
eat();  
super.eat();
}  
}  
public class Supermethod {

	public static void main(String[] args)
	{
	
	Dog obj=new Dog();  
	obj.work();  
	} 
}