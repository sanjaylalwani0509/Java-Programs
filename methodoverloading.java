//Method overloading
class overload
{
	void test()
	{
		System.out.println("No Parameters...");
	}
		
	void test(int a)
	{
		System.out.println("VAlue of A is : "+a);		
	}
	
	void test(int a,int b)
	{
		System.out.println("Value of A : "+a);
		System.out.println("Value of B : "+b);
	}

	double test(double a)
	{
		System.out.println("Double A : "+a);
		return a*a;
	}
}	

class methodoverloading
{
	public static void main(String args[])
	{
		overload ob=new overload();
		double result;
		ob.test();
		ob.test(10);
		ob.test(10,20);
		result=ob.test(12.5);
		System.out.println("Result of double : "+result);	
	}
}