package Mymavenproject;
//using this keyword
public class Details {
	String name;
	float salary;
	int age;
	Details(String name,float salary)
	{
		this.name=name;
		this.salary=salary;
		
	}
	Details(String name,float salary,int age)
	{
		this(name,salary);
		this.age=age;
	}
	public void show()
	{
		System.out.println(name);
		System.out.println(salary);
		System.out.println(age);
	}

	public static void main(String[] args) {
		Details obj=new Details("Anu",10000f);
		Details obj1=new Details("lena",160000f,24);
		obj.show();
		obj1.show();

	}

}
