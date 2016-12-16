public class MoreVariablesAndPrinting
{
	public static void main(String[] args)
	{
		String myName, myEyes, myTeeth, myHair;
		int myAge, myHeight, myWeight;

		myName = "Pudge"; // A dota 2 hero character name
		myAge = 36; // Actually, I don't really know how old he is
		myHeight = 75; // inches
		myWeight = 180; // lbs
		myEyes = "Blue";
		myTeeth = "White";
		myHair = "Brown";

		System.out.println("Let's talk about " + myName + ".");
		System.out.println("He's " + myHeight + " inches tall.");
		System.out.println("He's " + myWeight + " pounds heavey.");
		System.out.println("Actually, that's not too heavy.");
		System.out.println("He's got " + myEyes + " eyes and " + myHair + " hair.");
		System.out.println("His teeth are usually " + myTeeth + " depending on the coffee.");

		// This line is tricky; try to get it exactly right.
		System.out.println("If I add " + myAge + ", " + myHeight + ", and" + myWeight + " I get " + (myAge + myHeight + myWeight) + ".");
	}
}
