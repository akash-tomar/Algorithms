package OopLectureCode;


public class StudentUse {
	
	public static void printStudent(Student s1) {
		System.out.println("hey");
		System.out.println(s1.name + " " + s1);
	}
	
	public static void main(String args[]) {
		Student s = new Student("abc");
		printStudent(s);
		
	}
}
