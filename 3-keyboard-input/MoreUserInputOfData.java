import java.util.Scanner;

public class MoreUserInputOfData
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String firstName, lastName, loginName;
		int studentId, grade;
		double gpa;

		System.out.print("First name: ");
		firstName = keyboard.next();

		System.out.print("Last name: ");
		lastName = keyboard.next();

		System.out.print("Grade (9-12): ");
		grade = keyboard.nextInt();

		System.out.print("Student ID: ");
		studentId = keyboard.nextInt();

		System.out.print("Login: ");
		loginName = keyboard.next();

		System.out.print("GPA (0.0-4.0) ");
		gpa = keyboard.nextDouble();

		System.out.println("Your information:");
		System.out.println("+---------------------------------------------");
		System.out.println("|");
		System.out.println("|	Login : " + loginName);
		System.out.println("|	ID    : " + studentId);
		System.out.println("|	Name  : " + lastName + ", " + firstName);
		System.out.println("|	GPA   : " + gpa);
		System.out.println("|	Grade : " + grade);
		System.out.println("|");
		System.out.println("+---------------------------------------------");
	}
}
