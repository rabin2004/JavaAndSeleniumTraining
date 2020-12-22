package practice_Java;

// extends keyword -- produces child class and parent class relation => Inheritance
public class Grade extends student{

	public void passingGrade() {
		System.out.println("Student that passed the class");
	}
	
	public void failingGrade() {
		System.out.println("Student that failed the class");
	}
	
	public void incompleteGrade() {
		System.out.println("Student with incomplete grade");
	}
	
	public void retaking() { // Method overriding - same methods with same number of arguments both in child and parent class
		System.out.println("Grade of returning students");
	}
}
