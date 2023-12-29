
// multi-level inheritance (from 1 to 2nd and from 2 to 3)

class college
{
	String clgname;
	String add;
	college(String clgname,String add)
	{
		System.out.println("College Class Constructor called...");
		this.clgname=clgname;
		this.add=add;
	}
}

class course extends college
{
	String crsname;
	int sem,paper;
	course(String clgname,String add,String crsname,int sem,int paper)
	{
		super(clgname,add);
		System.out.println("Course Class Constructor called...");
		this.crsname=crsname;
		this.sem=sem;
		this.paper=paper;
	}
}

class stud extends course
{
	int rno;
	String name;
	
	stud(String clgname,String add, String crsname, int sem, int paper, int rno, String name)
	{
		super(clgname,add,crsname,sem,paper);
		System.out.println("Stud Class Constructor called...");
		this.rno=rno;
		this.name=name;
	}
	
	void printdata()
	{
		System.out.println("College : "+clgname);
		System.out.println("Address : "+add);
		System.out.println("Course name : "+crsname);
		System.out.println("Semester : "+sem);
		System.out.println("Paper : "+paper);
		System.out.println("Roll no. : "+rno);
		System.out.println("Name : "+name);
	}
}

class inheritance2
{
	public static void main(String args[])
	{
		stud s1=new stud("SSCCS","Sardarnagar","B.C.A",6,6,219,"Sanjay");
		s1.printdata();
	}
}