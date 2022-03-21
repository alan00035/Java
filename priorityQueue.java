import java.util.List;
import java.util.PriorityQueue;

class Student{
    int id;  String name;  double cgpa;

    Student(int id, String name, double cgpa){
        this.id =id;
        this.name=name;
        this.cgpa=cgpa;
    }

    String getName(){
        return name;
    }

    double getCGPA(){
        return cgpa;
    }
    
    public int compareTo(Student student){
        if(this.getCGPA() > student.getCGPA()){
            return 1;
        }else if(this.getCGPA()< student.getCGPA()){
            return -1;
        }else {
            return 0;
        }
    }
}


class Priorities {
    List<Student> getStudents(List<String> events){
        PriorityQueue queue = new PriorityQueue<>();
        Student student;
        String[] array = new String[3];

           for(String str: events){
                array = str.split(" ");
                if(!array[0].equals("SERVED"))
                    queue.add(new Student(Integer.parseInt(array[3]),
                                                 array[1],
                                                 Double.parseDouble(array[2])));

                       
                   System.out.println(queue.remove());
    // }
  
        
    }
     return null;
}

}
public class priorityQueue {
    // private final static Scanner scan = new Scanner(System.in);
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


// https://www.hackerrank.com/challenges/java-priority-queue/problem?isFullScreen=true