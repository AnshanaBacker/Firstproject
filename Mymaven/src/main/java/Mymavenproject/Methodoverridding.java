package Mymavenproject;
class Name
{
	public void show(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
}
class Other extends Name
{
	public void show(int a,int b)
	{
		int c=a-b;
		System.out.println(c);
	}
}
public class Methodoverridding {

	public static void main(String[] args) {
		
		Other obj=new Other();
		obj.show(5,4);
		obj.show(10,5);
		

	}

}
