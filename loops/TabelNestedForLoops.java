package loops;

import java.util.Scanner;

public class TabelNestedForLoops {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		for (int i = 1; i<=m; i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(" "+j*i);
			}
			System.out.println();
		}

	}

}
