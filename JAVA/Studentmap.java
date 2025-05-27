import java.util.HashMap;
import java.util.Scanner;

public class Studentmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();
        System.out.println("NO of values: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Enter the id and name of student  "+i);
       int id=sc.nextInt();
       String name=sc.next();
    
       map.put(id,name);
        }

        System.out.print("Enter student ID to get name: ");
        int target = sc.nextInt();

        if (map.containsKey(target)) {
            System.out.println("Name: " + map.get(target));
        } else {
            System.out.println("Student not found.");
        }

    }
}
