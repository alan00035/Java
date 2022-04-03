package hankerrank.medium;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.management.Query;

import java.math.BigDecimal;
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

      
        
        Comparator compare = new Comparator<Student>() {

            @Override
            public int compare(Student s1, Student s2) {
                if(s1.getCgpa() > s2.getCgpa()){
                    return -1;
                }else if(s1.getCgpa()< s2.getCgpa()){
                    return 1;
                }else{
                    if(s1.getName().compareTo(s2.getName())== 0)
                        return s1.getId() >s2.getId() ? 1:-1;
                    else
                        return s1.getName().compareTo(s2.getName());    
                }
            }

        };

        PriorityQueue<Student> pq = new PriorityQueue<Student>(compare);

        for(String str : events){
            String[] arr = str.split(" ");
            String order = arr[0];
            switch(order){
                case "ENTER": pq.add(new Student(Integer.parseInt(arr[3]), arr[1], Double.parseDouble(arr[2])));continue;
            
                case "SERVED": while(!pq.isEmpty()) pq.poll();
            }
        }
        
        // List<Student> list = new ArrayList<>();
// this part is important, priority queue return iterator randomly, need to pull and print at the time and make sure the queue is not empty
        while(pq.size()>1){
            System.out.println(pq.poll().name);
        }

        return new ArrayList<Student>(pq);
        // for(Student s : pq){
        //     list.add(new Student(s.getId(), s.getName(), s.getCgpa()));
        // }
          
        // return list;
    
    }
        

}

public class priorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {

        BigDecimal a = new BigDecimal("3");
        BigDecimal b= new BigDecimal("9");
        
        System.out.println(a.compareTo(b));
    //     int totalEvents = Integer.parseInt(scan.nextLine());    
    //     List<String> events = new ArrayList<>();
        
    //     while (totalEvents-- != 0) {
    //         String event = scan.nextLine();
    //         events.add(event);
    //     }
        
    //     List<Student> students = priorities.getStudents(events);
        
    //     if (students.isEmpty()) {
    //         System.out.println("EMPTY");
    //     } else {
    //         for (Student st: students) {
    //             System.out.println(st.getName());
    //         }
    //     }
    }
}