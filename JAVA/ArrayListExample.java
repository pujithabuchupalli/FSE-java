import java.util.*;

public class ArrayListExample {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ArrayList<String> names=new ArrayList<>();
        
        while(true){
            String name=sc.next();
            if(name.equalsIgnoreCase("done")) break;
            names.add(name);
        }
        System.out.println("Entered names:");
        for(String val:names){
            System.out.println(val);
        }

    }
}
