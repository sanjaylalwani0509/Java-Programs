import java.util.*;
class array2d
{
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j,r,c;
		System.out.print("Enter the value of Rows : ");
		r=sc.nextInt();
		System.out.print("Enter the value of Column : ");
		c=sc.nextInt();
		
		int[][] a=new int[r][c]; //Array DeclaredType
		
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print("Enter Data : ");
				a[i][j] = sc.nextInt();
			}
		}
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}