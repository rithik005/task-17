package ArrayTask;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the array size: ");
		int n = sc.nextInt();
		
		int[] a=new int[n];
		System.out.print("Enter array elements: ");
		
		for(int i=0; i < n; i++)
		{
			a[i] = sc.nextInt();
		}		
		 
		System.out.print("Enter element to search: ");
		int search = sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
			if(a[i] == search)
			{
				System.out.println("Element found at index " + i);
				break;
			}
		}
		sc.close();
	}

}
