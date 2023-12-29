class demo
{
	int x;
	static int y=10;
	//int y=10; //To understand more run this statement also and put the upper statement in comment
	demo(){} //default constructor
	demo(int x)
	{
		this.x=x;
	}
	void change_y()
	{
		y++;
	}
	void print_xy()
	{
		System.out.println("x= "+x);
		System.out.println("y= "+y);
	}
}

class staticdemo
{
	public static void main(String[] s)
	{
		demo o1=new demo(10);
		demo o2=new demo(20);
		demo o3=new demo();
		o1.change_y();
		o1.print_xy();
		
		o2.change_y();
		o2.print_xy();
		
		o3.change_y();
		o3.print_xy();
	}
}