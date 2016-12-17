import java.util.Scanner;

public class DumbCalculator
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		double firstNum, secondNum, thirdNum; // menggunakan koma 1,1 benar 1.1 salah

		System.out.print("What is your first number? ");
		firstNum = keyboard.nextDouble();

		System.out.print("WHat is your second number? ");
		secondNum = keyboard.nextDouble();

		System.out.print("What is your third number? ");
		thirdNum = keyboard.nextDouble();

		System.out.println("( " + firstNum + " + " + secondNum + " + " + thirdNum + " ) / 2 is... " + ((firstNum + secondNum + thirdNum) / 2));
	}
}
