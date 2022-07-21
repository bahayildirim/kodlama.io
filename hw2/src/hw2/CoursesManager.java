package hw2;

import java.util.ArrayList;
import java.util.List;

public class CoursesManager {
	
private List<Courses> courses;
	
	
	public CoursesManager() {
		courses = new ArrayList<>();
	}
	public void addCourse(Courses course) {
		courses.add(course);
		System.out.println("Course added");
	}
	public void deleteCourse(Courses course) {
		courses.remove(course);
		System.out.println("Course deleted");
	}
	public List<Courses> getAll(){
		return courses;
	}

}