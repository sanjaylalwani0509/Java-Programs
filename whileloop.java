import java.util.*;
class whileloop
{
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		int i,no;
		System.out.print("Enter value of no : ");
		no=sc.nextInt();
		i=1;
		while(i<11)
		{
			System.out.println(no+" * "+i+" = "+no*i);
			i++;
		}
	}
}