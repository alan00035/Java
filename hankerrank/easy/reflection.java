package hankerrank.easy;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

// import org.apache.commons.lang3.builder.ToStringBuilder;

public class reflection {
    public static void main(String[] args){
        Class student = new Student().getClass();
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(Method m: methods){
            methodList.add(m.getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }

}

class Student{
    private String name;
    private String id;
    private String email;


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   
    // @Override
    // public String toString(){
    //     return ToStringBuilder.reflectionToString(this,ToStringStyle.JSON_STYLE);
    // }

}


// https://www.hackerrank.com/challenges/java-reflection-attributes/problem?isFullScreen=true