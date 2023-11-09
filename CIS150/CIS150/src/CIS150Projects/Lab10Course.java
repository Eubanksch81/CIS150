package CIS150Projects;
import java.util.ArrayList;
// Class representing a student
public class Lab10Course {
	private ArrayList<Lab10Student> roster; // Collection of Student objects
	
	public Lab10Course() {
		roster = new ArrayList<Lab10Student>();
	}
   // Output each student in the course roster, and then the total size of the course
	public void printRoster() {
		//System.out.print(roster.toString() + " ");
		for (int i = 0; i < roster.size(); ++i) {
			System.out.print(roster.get(i) + " ");
		}
		System.out.println("Students: " + roster.size());	
	}
	public void addStudent(Lab10Student s) {
		roster.add(s);
	}
    
   // main
   public static void main(String args[]) {
      Lab10Course course = new Lab10Course();
      String first;  // first name
      String last;   // last name
      double gpa;    // grade point average
      
      first = "Henry";
      last = "Cabot";
      gpa = 3.5;
      course.addStudent(new Lab10Student(first, last, gpa));  // Add 1st student
      
      first = "Brenda";
      last = "Stern";
      gpa = 2.0;
      course.addStudent(new Lab10Student(first, last, gpa));  // Add 2nd student
      
      first = "Jane";
      last = "Flynn";
      gpa = 3.9;
      course.addStudent(new Lab10Student(first, last, gpa));  // Add 3rd student
      
      first = "Lynda";
      last = "Robison";
      gpa = 3.2;
      course.addStudent(new Lab10Student(first, last, gpa));  // Add 4th student
      course.printRoster();
   }    
}