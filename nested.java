import java.util.*;
class nested
{
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.print("Enter value of A : ");
		a=sc.nextInt();
		System.out.print("\nEnter value of B : ");
		b=sc.nextInt();
		System.out.print("\nEnter value of C : ");
		c=sc.nextInt();	
		
		if(a>b)
		{
			if(a>c)
				System.out.print("\nA is greater");
			else
				System.out.print("\nC is grater");
		}
		else
		{
			if(b>c)
				System.out.print("\nB is greater");
			else
				System.out.print("\nC is greater");
		}
	}
}