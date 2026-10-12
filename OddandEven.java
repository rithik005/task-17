package ArrayTask;

import java.util.Scanner;

public class OddandEven {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter array size: ");
		int n = sc.nextInt();
		
		int[] a = new int[n]; 
		
		int even = 0;
		int odd = 0;
		
		System.out.println("Enter array Element: ");
		
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
			if(a[i] % 2 == 0)
			{
				even++;
			}
			else {
				odd++;
			}
		}
		
		System.out.println("Even: " + even);
		System.out.println("Odd: " + odd);

		sc.close();
		
	}
}