import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

class Student{
    int id;  String name;  double cgpa;

    Student(int id, String name, double cgpa){
        super();
        this.id =id;
        this.name=name;
        this.cgpa=cgpa;

    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCgpa() {
        return this.cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {

        return super.toString();
    }
    


}

class Priorities {
    
    List<Student> getStudents(List<String> events){
        
      priorityQueue<Student> queue = new priorityQueue<>(new Comparator<Student>() {
          @Override
          public int compare(Student s1, Student s2){
              if(s1.getCgpa() < s2.getCgpa()){
                  return 1;    
              }
              else if(s1.getCgpa() > s2.getCgpa()){
                  return -1;
              }
              else{
                  if(s1.getName().compareTo(s2.getName())==0){
                      if(s1.getId() > s2.getId()){
                          return 1;
                      }
                      else if(s1.getId() < s2.getId()){
                          return -1;
                      }
                      else{
                          return 0;
                      }
                      
                  }else {
                      return s1.getName().compareTo(s2.getName());
                  }
              }

          }

      });
      
        for(String str: events){
            String[] array = str.split(" ");
            String order = array[0];
            switch(order){
                case "ENTER": queue.add(new Student(Integer.parseInt(array[3]),array[1],Double.parseDouble(array[2])));
                       continue;        
                case "SERVED":  queue.poll();             
                       continue;     
            }

        }     
        return new ArrayList(queue);  
        
    }
}

public class priorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}