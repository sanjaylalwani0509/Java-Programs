class CurrentThread
{
	public static void main(String args[])
	{
		Thread t=Thread.currentThread();
		System.out.println("Current is Thread : "+t);
		t.setName("My Main Thread");
		System.out.println("After name change : "+t);
		
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("i= "+i);
				t.sleep(1000);
			}			
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread Interrupted....");
		}
	}
}