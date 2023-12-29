class NewThread extends Thread
{
	NewThread()
	{
		super("Child Thread");
		System.out.println("Child Thread Created is : "+this);
		start();
	}
	
	public void run()
	{
		try
		{
			int i,no=5;
			for(i=1;i<11;i++)
			{
				System.out.println(no+"*"+i+"="+no*i);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Child Thread Interrupted...");
		}
		System.out.println("Child Thread exits");
	}
}

class threaddemo2
{
	public static void main(String args[])
	{
		new NewThread();
		try
		{
			int i,no=10;
			for(i=1;i<11;i++)
			{
				System.out.println(no+"*"+i+"="+no*i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread Interrupted...");
		}
		System.out.println("Main Thread exits");
	}
}
