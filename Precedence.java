public class Precedence {
    public static void main(String[] args) {

        System.out.println("******************************************");
        System.out.println("Operator Precedence and Associativity");
        System.out.println("******************************************");

        // Example 1: Multiplication has higher precedence than addition
        int result1 = 10 + 5 * 2;
        System.out.println("10 + 5 * 2       : " + result1);

        // Example 2: Parentheses have the highest priority
        int result2 = (10 + 5) * 2;
        System.out.println("(10 + 5) * 2     : " + result2);

        // Example 3: Multiple operators
        int result3 = 20 - 10 / 2;
        System.out.println("20 - 10 / 2      : " + result3);

        // Example 4: Left-to-right associativity
        int result4 = 20 / 5 * 2;
        System.out.println("20 / 5 * 2       : " + result4);

        // Example 5: Parentheses change the order
        int result5 = 20 / (5 * 2);
        System.out.println("20 / (5 * 2)     : " + result5);

        // Example 6: Relational and logical operators
        boolean result6 = 10 > 5 && 20 > 10;
        System.out.println("10 > 5 && 20 > 10 : " + result6);

        System.out.println("******************************************");
    }
}
