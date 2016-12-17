import java.util.Scanner;

public class AskingQuestions
{
	// varialble di sini error
	/* Scanner keyboard = new Scanner(System.in);

	int age;
	String height;
	double weight;*/

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int age;
		String height;
		double weight; // koma 1,1 buka 1.1

		System.out.print("How old are you? ");
		age = keyboard.nextInt();

		System.out.print("How tall are you? ");
		height = keyboard.next();

		System.out.print("How much do you weight? ");
		weight = keyboard.nextDouble();

		System.out.println("So you're " + age + " old, " + height + " tall and " + weight + " heavy.");
	}
}
