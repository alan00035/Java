package hankerrank.easy;
import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
    @Override
    public String toString() {
        return "Student ID: " + this.getId() + 
            ", Student Name: " + this.getFname() +
            ", Student Result: " + this.getCgpa();
    }
}

public class sort
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
        // Student st1 = new Student(33, "Rumpa", 3.68);
        // Student st2 = new Student(85, "Ashis ", 3.85);
        // Student st3 = new Student(56, "Samiha", 3.75);
        // Student st4 = new Student(19, "Samara", 3.75);
        // Student st5 = new Student(22, "Fahim", 3.76);

		
		List<Student> studentList = new ArrayList<Student>();
        // int testCases = studentList.size();
        
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();	
			Student st = new Student(id, fname, cgpa);
			// studentList.add(st1);
            // studentList.add(st2);
            // studentList.add(st3);
            // studentList.add(st4);
            // studentList.add(st5);
			
			testCases--;
		} 
            for(int j=studentList.size()-1; j>=0; j--){
                for (int k=j-1; k>=0;k--){
                    if(studentList.get(j).getCgpa() > studentList.get(k).getCgpa()){
                         Collections.swap(studentList, j, k);
                    }
                    
                    else if(studentList.get(j).getCgpa() == studentList.get(k).getCgpa() && 
                    studentList.get(j).getFname().compareTo(studentList.get(k).getFname())<0 ){
                         Collections.swap(studentList, j, k);
                    }
                }
            }
        
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
            
	}
}




