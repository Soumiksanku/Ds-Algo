package loops;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int number = 1;
		int m = sc.nextInt();
		for(int i = 1; i <= m; i++)
		{
			for (int j =1; j<=(m-i) ; j++)
			{
				System.out.print("  ");
			}
			for(int k = 1; k <=i;k++)
			{
				System.out.print(number++ +"   ");
			}
			System.out.println();
		}
	}
}


