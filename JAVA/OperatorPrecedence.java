public class OperatorPrecedence {

    public static void main(String[] args) {
        int result = 10 + 5 * 2;      // 10 + (5*2) = 20
        int result2 = (10 + 5) * 2;   // (10+5) * 2 = 30

        System.out.println("---- Operator Precedence ----");
        System.out.println("10 + 5 * 2 = " + result + " (Multiplication first)");
        System.out.println("(10 + 5) * 2 = " + result2 + " (Parentheses first)");
    }
}
