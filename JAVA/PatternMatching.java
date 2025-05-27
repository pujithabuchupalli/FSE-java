public class PatternMatching {
    public static void main(String[] args) {
        printObjectType("Hello");
        printObjectType(123);
        printObjectType(3.14);
        printObjectType(true);
    }

    static void printObjectType(Object obj) {
        switch (obj) {
            case String s -> System.out.println("It's a String: " + s);
            case Integer i -> System.out.println("It's an Integer: " + i);
            case Double d -> System.out.println("It's a Double: " + d);
            default -> System.out.println("Unknown type: " + obj);
        }
    }
}
