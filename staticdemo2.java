class demo
{
	static int x=10;
	int y;
	
	demo(int y)
	{
		this.y=y;
		x++;
		System.out.println("Constructor called.....!");
	}

	static //static block 
	{
		//x=10;
		System.out.println("This block will be automatically executed at very first...!");
	}
	
	static void printx() // static method (jo humesha static variables ko hi support kartaa hai)
	{
		System.out.println("x= "+x);
	}	
	
	void printxy()
	{
		System.out.println("x= "+x);
		System.out.println("y= "+y);
	}
}

class staticdemo2
{
	 
	public static void main(String[] s)
	{
		demo obj1=new demo(100);
		demo obj2=new demo(200);
		
		obj1.printxy();
		
		obj2.printxy();
		demo.printx(); //static function
	}
}

