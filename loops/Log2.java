package loops;

import java.util.Scanner;

public class Log2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float sum = 0f;
		for(float i =1f; i <=n; i++)
		{
			if (i%2 == 0)
			{
				sum -= 1/i;
			}
			else
			{
				sum += 1/i;
			}
		}
		
		System.out.println(sum);

	}

}
