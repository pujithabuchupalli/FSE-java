import java.util.*;
public class FactorialCalculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to compute Factorial:  ");
        int num=sc.nextInt();
        int fact=1;
        for(int i=num;i>0;i--){
            fact=fact*i;
        }
        System.out.println("Fatcorial of  "+num+"  is "+fact);
    }
    
}
