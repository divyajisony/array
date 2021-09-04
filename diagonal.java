package array;

import java.util.Scanner;

public class diagonal {

	public static void main(String[] args) {
		int n,flag=1;
		Scanner sc= new  Scanner(System.in);
		System.out.print("enter a input:");
		n=sc.nextInt();
		int a[][] =new int[n][n];
		for( int i=0;i<n;i++) {
			for( int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
			for( int i=0;i<n;i++)
			{
				for( int j=0;j<n;j++)
				{
					if(i!=j)
					{
						if(a[i][j]==0) {
							flag=1;
						}
						else {
							flag=0;
							break;
						}
					}
				}
			}
			if(flag==1) {
				System.out.println("yes");
			}
			else {
				System.out.println("No");
			}
	}

}
