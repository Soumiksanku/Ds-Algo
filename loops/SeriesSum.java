package loops;

import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float sum = 0f;
		for(float i =1f; i <= n; i++)
		{
			sum += 1/i;
		}
		System.out.println(sum);
	}
	

}
