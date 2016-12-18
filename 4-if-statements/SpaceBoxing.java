import java.util.Scanner;

public class SpaceBoxing
{
	public static double planetGravity (int planetId)
	{
		double gravityValue = 0.0;

		if (planetId == 1)
		{
			gravityValue = 0.78; // Venus
		}
		if (planetId == 2)
		{
			gravityValue = 0.39; // Mars
		}
		if (planetId == 3)
		{
			gravityValue = 2.65; // Jupiter
		}
		if (planetId == 4)
		{
			gravityValue = 1.17; // Saturn
		}
		if (planetId == 5)
		{
			gravityValue = 1.05; // Uranus
		}
		if (planetId == 6)
		{
			gravityValue = 1.23; // Neptune
		}

		return gravityValue;
	}

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int weight, planetId;

		System.out.print("Please enter your current earth weight: ");
		weight = keyboard.nextInt();

		System.out.println("I have information for the following planets:\n");
		System.out.println("   1. Venus   2. Mars    3. Jupiter");
		System.out.println("   4. Saturn  5. Uranus  6. Neptune\n");
		System.out.print("Which planet are you visiting? ");
		planetId = keyboard.nextInt();

		System.out.println("Your weight would be " + (weight * planetGravity(planetId)) + " pounds on that planet.");
	}
}


// #	Planet	Relative gravity
// 1	Venus	0.78
// 2	Mars	0.39
// 3	Jupiter	2.65
// 4	Saturn	1.17
// 5	Uranus	1.05
// 6	Neptune	1.23
// So, for example, if Julio weighs 128 lbs. on earth, then he would weigh just under 50 lbs. on Mars, since Mars' gravity is 0.39 times earth's gravity. (128 * 0.39 is 49.92)