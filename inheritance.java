
//Heirarchical inheritance (from 1 class to many class)
import java.util.*; 
class person
{
	int age;
	String name;
	Scanner sc=new Scanner(System.in);
	
	void getperson()
	{
		System.out.print("Enter the name : ");
		name=sc.next();
		name+=sc.nextLine();
		System.out.print("Enter the age : ");
		age=sc.nextInt();
	}
	void printperson()
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
}

class stud extends person
{
	int rno;
	String clgname;
	
	void getstud()
	{
		System.out.print("Enter the Rollno: ");
		rno=sc.nextInt();
		System.out.print("Enter the College name : ");
		clgname=sc.next();
		clgname+=sc.nextLine();
	}
	
	void printstud()
	{
		System.out.println("Roll no. : "+rno);
		System.out.println("College name : "+clgname);
	}
}
class emp extends person
{
	int empid;
	String deptname;
	void getemp()
	{
		System.out.print("Enter the employee Id : ");
		empid=sc.nextInt();
		System.out.print("Enter the Department name : ");
		deptname=sc.next();
		deptname+=sc.nextLine();
	}
	
	void printemp()
	{
		System.out.println("Employee Id : "+empid);
		System.out.println("Department Name : "+deptname);
	}
}

class inheritance
{
	public static void main(String[] s)
	{
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for student and 2 for Employee");
		System.out.print("Enter the choice : ");
		ch=sc.nextInt();
		
		if(ch==1)
		{
			stud s1=new stud();
			s1.getperson();
			s1.getstud();
			s1.printperson();
			s1.printstud();
		}
		else if(ch==2)
		{
			emp e1=new emp();
			e1.getperson();
			e1.getemp();
			e1.printperson();
			e1.printemp();
		}
		else
		{
			System.out.println("Enter the correct choice....");
		}
	}
}