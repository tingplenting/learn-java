import java.util.Scanner;

public class BMICalc
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int weight;
		double height, bmi;

		System.out.print("Your height in m: ");
		height = keyboard.nextDouble();

		System.out.print("Your weight in kg: ");
		weight = keyboard.nextInt();

		System.out.println("Your BMI is " + (weight / (height * height)));
	}
}

// Your height in m: 1.75
// Your weight in kg: 73

// Your BMI is 23.83673