class returndemo
{
	void add();
	public static void main(String args[])
	{
		boolean a=true;
		System.out.println("Before the return");
		
		void add()
		{
			System.out.println("Addition");
		}
		if(a)
			return;
		System.out.println("This won't execute");
	}
}