public class CustomException {
    public static void main(String args[]){
    int age=16;
    
         try {
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or above.");
            }
            System.out.println("Access granted.");
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }}

class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
    
    super(msg);
}
}
