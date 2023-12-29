class garbage
{
	static int count=0;
	static int maxx=5;
	
	garbage()
	{
		if(count<maxx)
		{
			count++;
		}
		else
		{
			System.out.println("Error--can't construct..");
			System.exit(0);
		}
	}
		
	protected void finalize()
	{
		count--;	
	}
	
	static void fun1()
	{
		garbage ob=new garbage();
		System.gc();
		System.runFinalization();
	}
	
	public static void main(String args[])
	{
		int i;
		for(i=0;i<maxx;i++)
		{
			fun1();
			System.out.println("Current Count is : "+count);
		}			
	}
}