package ArrayTask;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the array size: ");
		int n=sc.nextInt();
		
		int[] a=new int[n];
		int sum = 0;
		
		System.out.println("Enter array element: ");
		
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
			sum = sum + a[i];
		}
		System.out.println("sum: " + sum);
		
		sc.close();
	}
}