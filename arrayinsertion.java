
package array;
import java.util.Scanner;

public class arrayinsertion {
	public static void main(String[] args) {
		Scanner sc= new  Scanner(System.in);
		System.out.print("enter a input:");
		int size=sc.nextInt();
		int a[] =new int[20];
		for( int i=0;i<size;i++) {
				a[i]=sc.nextInt();
			
		}
       int pos =sc.nextInt();
       int ele =sc.nextInt();
       int temp=a[pos-1];
       a[pos-1]=ele;
        int i,temp2=0;
      for( i=pos;i<size;i++) {
	    temp2=temp;
	   temp=a[i];
	   a[i]=temp2;	
	   }
      System.out.println(temp2);
      
	}

}