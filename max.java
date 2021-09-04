package array;

import java.util.Scanner;

public class max{
	
	public static void main(String[] args) {
		int max=0;
		Scanner sc= new  Scanner(System.in);
		System.out.print("enter a input:");
	int	row=sc.nextInt();
	System.out.print("enter a input:");
	int	col=sc.nextInt();
	int [][]arr1 =new int[row][col];
	for( int i=0;i<row;i++)
		for( int j=0;j<col;j++)
		{
			arr1[i][j]=sc.nextInt();
		}
	{ 
		for( int i=0;i<row;i++)
		{
			for( int j=0;j<col;j++)
			{
				if(max<arr1[i][j])
				{
					max=arr1[i][j];
				}
			}
            System.out.println(max);
		}
	}
	}
}