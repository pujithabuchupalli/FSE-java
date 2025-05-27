import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println(n+"  is Even");
        }else{
             System.out.println(n+"   is odd");
        }
}
}
