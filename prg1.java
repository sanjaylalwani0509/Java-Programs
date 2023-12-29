import java.util.*;
class prg1	
{
	public static void main(String s[])
	{
		System.out.println("Hello sanjuuu...");
		Scanner sc=new Scanner(System.in);
		int no;
		System.out.print("Enter the number : ");
		no=sc.nextInt();
		
		if(no%2==0)
			System.out.println(no+" Number is Even");
		else
			System.out.println(no+" Number is Odd");
	}
}