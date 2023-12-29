
//Thread Priority..
class ThreadPriority implements Runnable
{
	int count=0;
	Thread t;
	private volatile boolean running=true;
	ThreadPriority(String Name,int Priority)
	{
		t=new Thread(this);
		t.setName(Name);
		t.setPriority(Priority);
	}
	
	public void run()
	{
			while(running)
				count++;		
	}
	
	public void stop()
	{
		running=false;
	}
	
	public void start()
	{
		t.start();
	}

}

class threaddemo5
{
	public static void main(String args[])
	{
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		ThreadPriority high=new ThreadPriority("High Priority",7);
		ThreadPriority low=new ThreadPriority("High Priority",3);
		
		high.start();
		low.start();
		
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread Interrupted..");
		}
		
		//Stopping counting in threads..
		high.stop();
		low.stop();
		
		//Waiting for threads to terminate..
		
		try
		{
			high.t.join();
			low.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread Interrupted..");
		}
		
		System.out.println("Counting by High Priority Thread : "+high.count);
		System.out.println("Counting by low Priority Thread : "+low.count);
		
	}
}





