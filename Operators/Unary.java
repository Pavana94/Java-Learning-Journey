
public class Unary {
    public static void main(String[] args) {

        int a = 10;

        System.out.println("******************************************");
        System.out.println("Original value  : " + a);

        // Unary Plus
        System.out.println("Unary Plus      : " + (+a));

        // Unary Minus
        System.out.println("Unary Minus     : " + (-a));

        // Post-Increment
        a = 10;
        System.out.println("Post-Increment  : " + (a++));
        System.out.println("After a++       : " + a);

        // Pre-Increment
        a = 10;
        System.out.println("Pre-Increment   : " + (++a));
        System.out.println("After ++a       : " + a);

        // Post-Decrement
        a = 10;
        System.out.println("Post-Decrement  : " + (a--));
        System.out.println("After a--       : " + a);

        // Pre-Decrement
        a = 10;
        System.out.println("Pre-Decrement   : " + (--a));
        System.out.println("After --a       : " + a);

        // Logical NOT
        boolean isStudent = true;
        System.out.println("Original bool   : " + isStudent);
        System.out.println("Logical NOT     : " + (!isStudent));

        System.out.println("******************************************");
    }
}
