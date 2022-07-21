package hw2;

public class Courses {
	private int courseId;
	private String courseName;
	private double percentageCompleted;
	private Instructors instructor;
	private Categories category;
	
	public void listCourseInfo() {
		System.out.println("----------------------------");
		System.out.println("Course ID: " + this.courseId);
		System.out.println("Course Name: " + this.courseName);
		System.out.println("Percentage Completed: " + this.percentageCompleted);
		System.out.println("Instructor Name: " + this.instructor.getName());
		System.out.println("Instructor Surname: " + this.instructor.getSurname());
		System.out.println("Category Name: " + this.category.getCategoryName());
		System.out.println("----------------------------");
	}
	
	public Courses(int courseId, String courseName, double percentageCompleted, Instructors instructor,  Categories category) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.percentageCompleted = percentageCompleted;
		this.instructor = instructor;
		this.category = category;
	}

	public Courses() {
		
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Instructors getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructors instructor) {
		this.instructor = instructor;
	}
	
	public double getPercentageCompleted() {
		return percentageCompleted;
	}

	public void setPercentageCompleted(double percentageCompleted) {
		this.percentageCompleted = percentageCompleted;
	}

	public Categories getCategory() {
		return category;
	}

	public void setCategory(Categories category) {
		this.category = category;
	}
}