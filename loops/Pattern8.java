package loops;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int m = sc.nextInt();
		for(int i = 1; i <= m; i++)
		{
			for (int j =1; j<= i ;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for(int i = 1; i <= m; i++)
			{
				for(int k = m-1; k >=i;k--)
				{
					System.out.print("* ");
				}
			    System.out.println();
			}
	}
}
