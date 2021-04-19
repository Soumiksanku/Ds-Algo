package loops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int temp = number;
		int reverse = 0;
		while(temp>0)
			{
				int lastDigit = temp%10;
				reverse = reverse*10+lastDigit;
				temp/=10;
			}
		if (reverse == number)
		{
			System.out.println(number + " is palindrome");
		}
		else
		{
			System.out.println(number + " is not  palindrome");
		}
		

	}

}
