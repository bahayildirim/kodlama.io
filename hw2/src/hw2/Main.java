package hw2;

public class Main {
	public static void main(String[] args) {
		Instructors instructor1 = new Instructors("Engin", "Demiroğ", 1);
		Categories category1 = new Categories(1, "Programming");
		Categories category2 = new Categories(1, "Databases");

		Courses course1 = new Courses(1, "C# + Angular", 60.0, instructor1, category2);
		Courses course2 = new Courses(2, "Java + REACT", 70.0, instructor1, category1);
		Courses course3 = new Courses(3, "JavaScript", 10.0, instructor1, category1);
		Courses course4 = new Courses(4, "Entry to Programming", 0.0, instructor1, category1);

		CoursesManager courseManager = new CoursesManager();
		courseManager.addCourse(course1);
		courseManager.addCourse(course2);
		courseManager.addCourse(course3);
		courseManager.addCourse(course4);
		System.out.println("");

		for (Courses course : courseManager.getAll()) {
			System.out.println(course.getCourseName());
		}
		
		System.out.println("");
		courseManager.deleteCourse(course2);
		System.out.println("");
		
		for (Courses course : courseManager.getAll()) {
			System.out.println(course.getCourseName());
		}

	}
}