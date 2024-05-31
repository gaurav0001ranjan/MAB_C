package boi.com;

public class Emp_account {
	int empid;
	String name;
	float acnt_bal;
	public void display()
	{
		System.out.println("\n EmpName:" +name+ "\n Empid:" +empid+ "\n Available_balance:" +acnt_bal);
	}
	public static void main(String[] args) 
	{
		Emp_account emp1=new Emp_account();
		emp1.name="Shwetha";
		emp1.empid=101;
		emp1.acnt_bal=12000;
		emp1.display();
		
		Emp_account emp2=new Emp_account();
		emp2.name="Gaurav";
		emp2.empid=102;
		emp2.acnt_bal=13000;
		emp2.display();

	}

}

