import java.lang.reflect.Method;

public class ReflectionDemo {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("MyClass");
        Object obj = cls.getDeclaredConstructor().newInstance();
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Method: " + method.getName());
        }
        Method greetMethod = cls.getMethod("greet");
        greetMethod.invoke(obj);
        Method msgMethod = cls.getMethod("showMessage", String.class);
        msgMethod.invoke(obj, "This is reflection in Java!");
    }
}
