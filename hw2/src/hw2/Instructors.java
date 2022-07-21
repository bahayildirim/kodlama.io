package hw2;

public class Instructors {
	private int instructorId;
	private String name;
	private String surname;
	
	public Instructors(String name, String surname, int instructorId) {
		this.name = name;
		this.surname = surname;
		this.instructorId = instructorId;
	}

	public Instructors() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}
	
}