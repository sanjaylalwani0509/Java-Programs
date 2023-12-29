import java.util.*;

class student
{
	int rno;
	String sname;
	long mno;
	
	student()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Roll no. : ");
		rno=sc.nextInt();
		
		System.out.print("Enter name : ");
		sname=sc.next();
		sname+=sc.nextLine();
	
		System.out.print("Enter Mobile no. : ");
		mno=sc.nextLong();
	}
	
	student(int r, String n, long m)
	{
		rno=r;
		sname=n;
		mno=m;
	}
	
	void printdata()
	{
			System.out.println("Roll no is :"+rno);
			System.out.println("Name is : "+sname);
			System.out.println("Mobile no is :"+mno);
	}

}

class classdemo
{
	public static void main(String s[])
	{
		student s1=new student();
		student s2=new student(234,"Sudhir",123456789);

		s1.printdata();
		s2.printdata();

	}
}