import java.util.*;
public class StringReversal {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=sc.next();
        StringBuilder sb=new StringBuilder(str);
        String result=sb.reverse().toString();
        System.out.println("The reversed String is: "+result);
    }
    
}
