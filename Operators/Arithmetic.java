import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Arithmetic Operators
        System.out.println("\nArithmetic Operations");
        System.out.println("---------------------");

        System.out.println("Addition       : " + (a + b));
        System.out.println("Subtraction    : " + (a - b));
        System.out.println("Multiplication : " + (a * b));

        if (b != 0) {
            System.out.println("Division       : " + ((double) a / b));
            System.out.println("Modulus        : " + (a % b));
        } else {
            System.out.println("Division       : Cannot divide by zero");
            System.out.println("Modulus        : Cannot divide by zero");
        }

        sc.close();
    }
}
