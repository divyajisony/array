package array;

import java.util.Scanner;

public class maxincol {

	public static void main(String[] args) {
		int i,j;
		int n,m,a;
		int max=0;
		Scanner sc = new  Scanner(System.in);
		System.out.print("enter a input:");
		n=sc.nextInt();
		System.out.print("enter a input:");
	m=sc.nextInt();
	//System.out.print("enter a input:");
	int [][]arr1 =new int[n][m];
	for( i=0;i<n;i++) {
		for(  j=0;j<m;j++)
		{
			arr1[i][j]=sc.nextInt();
		}
		for(  i=0;i<n;i++)
		{
			for(  j = 1;j<m;j++)
			{
				if(arr1[i][j]>max)
				{
					max=arr1[i][j];
					
				}
				System.out.println(max);
			}
		}
	}
	}
}