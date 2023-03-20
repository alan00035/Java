package hankerrank.medium;
import java.io.ObjectInputStream.GetField;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class reflectionPrivateAccess {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException, NoSuchFieldException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Inner i = new Inner();
        Object o = i.new test1();

        Method m = o.getClass().getDeclaredMethod("usecase", int.class);
        m.setAccessible(true);

       System.out.println( m.invoke(o, 2));
        
    




    }
    static class Inner{
        private class test1{
            private String usecase(int a){
              return  "private   ==== " +  a ;
            }
        }
}
}
