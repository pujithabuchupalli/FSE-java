public class TypeCasting {

    public static void main(String[] args) {
        double myDouble = 9.78;
        int myInt = (int) myDouble; // Explicit narrowing

        int number = 25;
        double newDouble = number; // Implicit widening

        System.out.println("---- Type Casting Example ----");
        System.out.println("Original double: " + myDouble);
        System.out.println("Double to int (casted): " + myInt);
        System.out.println("Original int: " + number);
        System.out.println("Int to double (casted): " + newDouble);
    }
}
