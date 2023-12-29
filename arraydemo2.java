import java.util.*;
class arraydemo2
{
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.print("Enter the no. of Elements : ");
		n=sc.nextInt();
		int a[]=new int[n]; //user je data enter kare etli size no array declare thaay
		
		for(i=0;i<n;i++)
		{
			System.out.print("Enter the "+(i+1)+" element : ");
			a[i]=sc.nextInt();
		}
		
		//Normal print
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
		/*Reverse Print
		for(i=n-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}	*/
	}
}