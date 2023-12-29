
//Method with object as parameter
import java.util.*;

class add
{
	int x;
	add(){} //default
	add(int a) //parameterized
	{
		x=a;
	}
	void sum(add a1, add a2)
	{
		x=a1.x + a2.x;
		System.out.println("x= "+x);
	}
}

class methodobj
{
	public static void main(String[] args)
	{
		add a1=new add(10);
		add a2=new add(20);
		add a3=new add();
		a3.sum(a1,a2);
	}
}