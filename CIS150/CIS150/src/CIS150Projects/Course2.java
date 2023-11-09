package CIS150Projects;
import java.util.ArrayList;

public class Course2 {

	private ArrayList<Student2> roster; // Collection of Student objects

	public Course2() {
		roster = new ArrayList<Student2>();
	}
   
   // Return an ArrayList of all Students with a GPA of at least 3.5
	public ArrayList<Student2> getDeansList() {
	   ArrayList<Student2> deanList = new ArrayList<Student2>();
		for (int i = 0; i < roster.size(); ++i) {
		   if (roster.get(i).getGPA() > 3.4) {
			   deanList.add(roster.get(i));
		   }
	   }
	   return deanList;
	}

	public void addStudent(Student2 s) {
		roster.add(s);
	}
	
	// main
   public static void main(String args[]) {
      Course2 course = new Course2();
      ArrayList<Student2> deanList = new ArrayList<Student2>();
      String first;  // first name
      String last;   // last name
      double gpa;    // grade point average
      
      first = "Henry";
      last = "Nguyen";
      gpa = 3.5;
      course.addStudent(new Student2(first, last, gpa));  // Add 1st student
      
      first = "Brenda";
      last = "Stern";
      gpa = 2.0;
      course.addStudent(new Student2(first, last, gpa));  // Add 2nd student
      
      first = "Lynda";
      last = "Robison";
      gpa = 3.2;
      course.addStudent(new Student2(first, last, gpa));  // Add 3rd student
      
      first = "Sonya";
      last = "King";
      gpa = 3.9;
      course.addStudent(new Student2(first, last, gpa));  // Add 4th student

      deanList = course.getDeansList();
		System.out.println("Dean's list:");
		for (Student2 student: deanList) {
			System.out.println(student);     // Expect: ArrayList with Henry and Sonya
		}
   }    
}