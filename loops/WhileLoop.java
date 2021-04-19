package loops;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int temp = number;
		int sum = 0;
		while(temp>0)
			{
				int lastDigit = temp%10;
				temp/= 10;
				sum+= lastDigit;
				System.out.println(lastDigit + " "+temp+""+sum);
			}
		System.out.println("The sum of digits of "+number+" is "+sum);
	}
}
