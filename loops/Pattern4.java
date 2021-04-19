package loops;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int m = sc.nextInt();
		for(int i = 1; i <= m; i++)
		{
			
			for(int k = m; k >=i;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
