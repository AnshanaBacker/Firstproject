package Mymavenproject;
//Employee details get from the main method and
//print on main method
public class EmployeeDetails {
	
	public String show(String name,float salary)
	{
		return name+"  "+salary;
	}

	public static void main(String[] args) {
		EmployeeDetails obj=new EmployeeDetails();
		EmployeeDetails obj1=new EmployeeDetails();
		System.out.println(obj.show("Anu",15000f));
		System.out.println(obj1.show("Meenu",20000f));
		

		
		
	}

}
