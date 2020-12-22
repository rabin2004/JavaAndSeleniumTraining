package practice_Java;

public class Winter2020Semester {

	public static void main(String[] args) {
		// static polymorphism -- compile time polymorphism
		Grade g = new Grade();

		g.passingGrade(); // from grade class
		g.failingGrade(); // from grade class
		g.newStudents(); // from student class -- as grade extends student
		g.enrollingStudents(); // from school class -- as as grade extends student extends school
		g.programs(); // from school class -- as as grade extends student extends school
		
		g.retaking(); // overridden method -- child method will override parent method so child method wiil execute
		student st = new student();
		st.retaking(); // parent method will execute -- since it is direclty called using object reference of parent class
		
		faculty f = new faculty();
		
		f.firedFaculty(); //from faculty class
		f.newFaculty(); //from faculty class
		f.hiringFaculty(); //from school class -- as faculty extends school
		
		//dynamic polymorphism -- run time polymorphism
		// also called Top-casting
		school s = new student(); //child class object can be referred by parent class reference variable
		
		s.programs(); // from school class
		s.enrollingStudents(); // from school class --- can't call child class method
	}

}
