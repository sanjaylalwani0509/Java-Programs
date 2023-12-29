class NewThread implements Runnable
{	
	Thread t;
	NewThread()
	{
		t=new Thread(this,"Child Thread");
		System.out.println("Child Thread is created : "+t);
		t.start();		
	}
	public void run()
	{
		try
		{
			int i,no=5;
			for(i=1;i<11;i++)
			{
				System.out.println(no+"*"+i+"="+no*i);
				t.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Child Thread Interrupted...");
		}
		System.out.println("Child Thread exits");
	}
}

class threaddemo
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