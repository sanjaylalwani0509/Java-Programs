import java.util.*;
class arraydemo
{
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		int i;
		int a[] = new int[3];
		for(i=0;i<3;i++)
		{
			System.out.print("Enter the "+(i+1)+" element : ");
			a[i]=sc.nextInt();
		}
		//Normal print
		for(i=0;i<3;i++)
		{
			System.out.println(a[i]);
		}
		/*Reverse Print
		for(i=2;i>=0;i--)
		{
			System.out.println(a[i]);
		}	*/
	} 
}