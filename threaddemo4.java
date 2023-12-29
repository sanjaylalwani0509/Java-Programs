
//Use of Isalive() and join()
class NewThread implements Runnable
{	
	Thread t;
	String str;
	NewThread(String name)
	{
		str=name;
		t=new Thread(this,name);
		System.out.println("Child Thread is created : "+str);
		t.start();		
	}
	public void run()
	{
		try
		{
			int i,no=5;
			for(i=1;i<11;i++)
			{
				System.out.println(str+no+"*"+i+"="+no*i);
				t.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Child Thread Interrupted...");
		}
		System.out.println(str+" Thread exits");
	}
}

class threaddemo4
{
	public static void main(String args[]) throws InterruptedException 
	{
		NewThread nt1 = new NewThread("One");
		NewThread nt2 =new NewThread("Two");
		NewThread nt3 =new NewThread("Three");
		
		
		System.out.println("Thread One is Alive : "+nt1.t.isAlive());
		System.out.println("Thread Two is Alive : "+nt2.t.isAlive());
		System.out.println("Thread Three is Alive : "+nt3.t.isAlive());
		
		try
		{
			System.out.println("Waiting for Threads to finish their execution....");
			
			nt2.t.join();
			nt1.t.join();
			nt3.t.join();			
		}
		catch(InterruptedException e)
		{	
			System.out.println("Main Thread Interrupted...");
		}
		System.out.println("Thread One is Alive : "+nt1.t.isAlive());
		System.out.println("Thread Two is Alive : "+nt2.t.isAlive());
		System.out.println("Thread Three is Alive : "+nt3.t.isAlive());
	}
}