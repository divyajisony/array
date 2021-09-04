package array;

import java.util.Scanner;

public class arryrange {

	public static void main(String[] args) {
		int range;
		Scanner sc= new  Scanner(System.in);
		System.out.print("enter a input:");
		int n=sc.nextInt();
		int arr[] =new int[20];
		for( int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
				}
			int max=arr[0],min=arr[0];
			for(int i=0;i<n;i++) {
				if(max<arr[i]) {
					max=arr[i];
					}
			}
			for(int i=0;i<n;i++) {
			 if(arr[i]<arr[i]) {
			     	min=arr[i];
			     	}
			}
			
	         range=max-min;
			System.out.println(range);
			
}
}