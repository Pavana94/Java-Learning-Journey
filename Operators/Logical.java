import java.util.Scanner;

public class Logical {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first boolean value (true/false): ");
		boolean a = sc.nextBoolean();

		System.out.print("Enter second boolean value (true/false): ");
		boolean b = sc.nextBoolean();

		System.out.println("\nLogical Operations");
		System.out.println("------------------");

		System.out.println("a && b : " + (a && b));
		System.out.println("a || b : " + (a || b));
		System.out.println("!a     : " + (!a));
		System.out.println("!b     : " + (!b));

		sc.close();
	}
}
