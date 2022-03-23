import java.util.*;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

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
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getCgpa() < o2.getCgpa()) return 1;
                if(o1.getCgpa() > o2.getCgpa()) return -1;
                else {
                    if( o1.getName().compareTo(o2.getName()) == 0)
                        if(o1.getId() > o2.getId()) return 1;
                        else if (o1.getId() < o2.getId()) return -1;
                        // else return 0;
                    else 
                        return o1.getName().compareTo(o2.getName());    
                }

            }
          
        });
    
    //     for(String str: events){
    //         String[] array = str.split(" ");
    //         if(!array[0].equals("SERVED"))
    //             queue.add(new Student(Integer.parseInt(array[3]),array[1],Double.parseDouble(array[2]))); 
         
    // }
    //  return null;
}
}

public class priorityQueue {
    // private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        // int totalEvents = Integer.parseInt(scan.nextLine());    
        // List<String> events = new ArrayList<>();
        
        // while (totalEvents-- != 0) {
        //     String event = scan.nextLine();
        //     events.add(event);
        // }
        
        // List<Student> students = priorities.getStudents(events);
        
    //     if (students.isEmpty()) {
    //         System.out.println("EMPTY");
    //     } else {
    //         for (Student st: students) {
    //             System.out.println(st.getName());
    //         }
    //     }
    // }
}


// https://www.hackerrank.com/challenges/java-priority-queue/problem?isFullScreen=true