import java.util.*;
class employee
{
	int eid;
	String ename,dept;
	double salary,da,hra,pf,gsal;
	
	void getData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Employee Id : ");
		eid=sc.nextInt();
		System.out.print("Enter Employee name : ");
		ename=sc.next();
		ename+=sc.nextLine();
		System.out.print("Enter Department name : ");
		dept=sc.next();
		dept+=sc.nextLine();
		System.out.print("Enter Salary : ");
		salary=sc.nextDouble();	
	}
	
	void calsal()
	{
		da=salary*0.02;
		hra=salary*0.03;
		pf=salary*0.12;
		gsal=(salary+da+hra)-pf;
		System.out.println("Dearness allowance : "+da);
		System.out.println("House Rent Allowance : "+hra);
		System.out.println("Provident Fund : "+pf);
		System.out.println("Gross Salary : "+gsal);
	}
	
	void printdata()
	{
		System.out.println("Emp no. is : "+eid);
		System.out.println("Emp name is : "+ename);
		System.out.println("Department name is : "+dept);
		System.out.println("Salary is : "+salary);
		calsal();
	}
}

class classdemo2								
{
	public static void main(String s[])
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many no. of employees you want : ");
		n=sc.nextInt();
		
		employee[] e=new employee[n];//array declare
		
		//First loop is for memory allocation to array
		for(i=0;i<n;i++)
			e[i]=new employee();
		
		for(i=0;i<n;i++)
			e[i].getData();
		
		for(i=0;i<n;i++)
			e[i].printdata();
	}
}





