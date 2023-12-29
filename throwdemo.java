class throwdemo
{
	static void temp()
	{
		try
		{
			int a=1000,b=0,c;
			c=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Caught inside temp().....!");
			throw e;
		}
	}

	public static void main(String args[])
	{
		try
		{
			temp();
		}
		catch(ArithmeticException e)
		{
			System.out.println("ReCaught inside main().....!");
		}
		
		
	}

}