//INTERFACE DEMO
import java.util.*;
interface arithmetic
{
	int s=10; //This value will be final in all the places,bcz this variable is declared in interface...
	void sum(int a, int b);
	void subtract(int a, int b);
}

class client implements arithmetic
{
	public void sum(int a, int b)
	{
		int c = a+b;
		System.out.println("Addition : "+c);
	}
	public void subtract(int a, int b)
	{
		int c = a-b;
		System.out.println("Subtraction : " +c);
	}
	void multiply(int a, int b)
	{
		int c=a*b;
		System.out.println("Multiplication : " +c);
	}
}
class interfacedemo1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		client c = new client();
		System.out.print("Enter First number : ");
		n1=sc.nextInt();
		System.out.print("Enter Second Number : ");
		n2=sc.nextInt();
		c.sum(n1,n2);
		c.subtract(n1,n2);
		c.multiply(n1,n2);	
	}
}