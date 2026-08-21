import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        System.out.print("Enter another number: ");
        int b = sc.nextInt();

        System.out.println("\nAssignment Operations");
        System.out.println("---------------------");

        a += b;
        System.out.println("a += b : " + a);

        a -= b;
        System.out.println("a -= b : " + a);

        a *= b;
        System.out.println("a *= b : " + a);

        if (b != 0) {
            a /= b;
            System.out.println("a /= b : " + a);

            a %= b;
            System.out.println("a %= b : " + a);
        } else {
            System.out.println("Division and modulus cannot be performed with zero.");
        }

        sc.close();
    }
}
