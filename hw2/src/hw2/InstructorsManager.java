package hw2;

import java.util.ArrayList;
import java.util.List;

public class InstructorsManager {
	
private List<Instructors> instructors;
	
	
	public InstructorsManager() {
		instructors = new ArrayList<>();
	}
	public void addInstructor(Instructors instructor) {
		instructors.add(instructor);
		System.out.println("Instructor added");
	}
	public void deleteInstructor(Instructors instructor) {
		instructors.remove(instructor);
		System.out.println("Instructor deleted");
	}
	public List<Instructors> getAll(){
		return instructors ;
	}

}