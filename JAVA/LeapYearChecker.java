import java.util.*;
public class LeapYearChecker {
    public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
        System.out.println("Enter any year");
        int year=sc.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(year+"  is Leap Year");
        }else{
             System.out.println(year+"   is non Leap Year");
        }
}
}