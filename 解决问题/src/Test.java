import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {

    private int age;
    private String name;
    private int testint;

    public Test(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("hello" + name + "i am" + age);
    }


    private Test(String name) {
        this.name = name;
        System.out.println("My Name is" +
                name);
    }

    public Test() {
    }

    private void welcome(String tips){
        System.out.println(tips);
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<ListNode> listNodeClass = ListNode.class;
        Class<? super ListNode> superclass = listNodeClass.getSuperclass();
        System.out.println(superclass);
        Constructor<?>[] declaredConstructors = listNodeClass.getDeclaredConstructors();
        Method[] declaredMethods = listNodeClass.getDeclaredMethods();
        Field[] declaredFields = listNodeClass.getDeclaredFields();
        Class<?>[] declaredClasses = listNodeClass.getDeclaredClasses();
        Annotation[] declaredAnnotations = listNodeClass.getDeclaredAnnotations();
        System.out.println(Arrays.toString(declaredConstructors));
        System.out.println(Arrays.toString(declaredMethods));
        System.out.println(Arrays.toString(declaredFields));
        System.out.println(Arrays.toString(declaredClasses));
        System.out.println(Arrays.toString(declaredAnnotations));
    }

}
