// Exception handling Demo

class multicatch
{	
	public static void main(String args[])
	{
		try
		{
			try
			{
				int a[]={1,2};
				int b=args.length;
				if(b==0)
				{
					int c=1000/b;
				}
				else
				{
					a[35]=1000;
				}		
			}
			catch(ArithmeticException e)
			{
				System.out.println("Arithmetic Exception : "+e);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Array Index Out Of Bounds Exception : "+e)
			}
			System.out.println("Statement after try catch block...!");	
			
			
			
			
	}
	
}