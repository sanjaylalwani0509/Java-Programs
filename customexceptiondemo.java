class MyException extends Exception
{
	private int description;
	MyException(int n)
	{
		description=n;
	}
	public String toString()
	{
		return"MyException : "+description+" is less than 100";
	}
	
}
class customexceptiondemo
{
	static void CheckNumber(int a) throws MyException
	{
		System.out.println("CheckNumber() is checking number"+a+".....");
		if(a<100)
			throw new MyException(a);
		else
			System.out.println("Normal Exit....");
	}
	public static void main(String args[])
	{
		try
		{
			CheckNumber(120);
			CheckNumber(3);
		}
		catch(MyException e)
		{
			System.out.println("Exception caught : "+e);
		}
	}
}