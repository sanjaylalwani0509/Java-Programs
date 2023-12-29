
//creating multiplethread


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
				System.out.println(str+" "+no+"*"+i+"="+no*i);
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

class threaddemo3
{
	public static void main(String args[]) throws InterruptedException 
	{
		new NewThread("First");
		new NewThread("Second");
		new NewThread("Third");
	}
}