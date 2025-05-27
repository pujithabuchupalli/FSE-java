public class MethodOverloading {
    public void add(int a,int b){
        System.out.println("The sum is: "+(a+b));
    }
    public void add(double a,double b){
        System.out.println("The sum is: "+(a+b));
    }
    public void add(int a,int b,int c){
        System.out.println("The sum is: "+(a+b+c));
    }
    public static void main(String args[]){
        MethodOverloading obj=new MethodOverloading();
        obj.add(10,20);
        obj.add(77.9999,10.2864);
        obj.add(10,20,30);
    }
}
