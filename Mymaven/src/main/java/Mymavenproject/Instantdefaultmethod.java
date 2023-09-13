package Mymavenproject;
//get value from main method and print on
//instant default method.
public class Instantdefaultmethod {
	String name;
	int age;
	Instantdefaultmethod(String a,int b)
	{
		name=a;
		age=b;
	}
	public void show()
	{
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
	
		Instantdefaultmethod obj=new Instantdefaultmethod("Ann",26);
		obj.show();
	}

}
