public class Employee
{
	int eid;
	String name;
	double salary;
	String dept;
	public void printDetails()
	{
		System.out.println(eid);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(dept);
	}
	Employee(int eid,String name,double salary,String dept)
	{
		this.eid=eid;
		this.name=name;
		this.salary=salary;
		this.dept=dept;
		
	}

}
