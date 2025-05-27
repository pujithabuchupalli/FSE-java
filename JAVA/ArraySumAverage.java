import java.util.*;
public class ArraySumAverage{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int average=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        average=sum/n;
        System.out.println("Sum of the array is:  "+sum);
        System.out.println("The average of the array is: "+average);
    }
}