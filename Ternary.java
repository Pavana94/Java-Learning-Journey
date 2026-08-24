import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("\nTernary Operations");
        System.out.println("------------------");

       
        // Check whether numbers are equal
        String result = (a == b) ? "Both are equal" : "Both are not equal";
        System.out.println("Result         : " + result);

        // Check even or odd
        String evenOdd = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println("First number   : " + evenOdd);

        sc.close();
    }
}
