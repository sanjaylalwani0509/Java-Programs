
//DMD means Dynamic Method Dispatch

class A
{
	void printmsg()
	{
		System.out.println("printmsg() of Class A");
	}
}

class B extends A
{
	void printmsg()
	{
		System.out.println("printmsg() of Class B");
	}
}

class C extends B
{
	void printmsg()
	{
		System.out.println("printmsg() of Class C");
	}
}

class dmd 
{
	public static void main(String args[])
	{
		A obja=new A();
		B objb=new B();
		C objc=new C();
		
		obja.printmsg();
		objb.printmsg();
		objc.printmsg();
		
		System.out.println("============================");
		
		obja=objb;
		obja.printmsg();
		
		obja=objc;
		obja.printmsg();

	}
}