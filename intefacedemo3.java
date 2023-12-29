interface A
{
	void meth1();
	void meth2();
}
interface B extends A
{
	void meth3();
}
class demo implements B
{
	public void meth1()
	{
		System.out.println("First Method is called...");
	}
	public void meth2()
	{
		System.out.println("Second Method is called...");
	}
	public void meth3()
	{
		System.out.println("Third Method is called...");
	}
	void meth4()
	{
		System.out.println("Fourth Method is called...");
	}	
}
class interfacedemo3
{
	public static void main(String args[])
	{
		demo d1=new demo();
		B ob1;
		ob1=d1;
		ob1.meth1();
	}
}