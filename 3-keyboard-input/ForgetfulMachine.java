import java.util.Scanner;

public class ForgetfulMachine
{
	public static void main(String[] args)
	{
		Scanner keyboard =  new Scanner(System.in);

		System.out.print("Give me a word! \n");
		keyboard.next();

		System.out.println("Great, now your favorite number? ");
		keyboard.next();

		System.out.println("And your second-favorite number... ");
		keyboard.next();

		System.out.println("Whew! Wasn't that fun?");
	}
}
