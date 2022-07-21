package hw2;

import java.util.ArrayList;
import java.util.List;

public class CategoriesManager {
	
private List<Categories> categories;
	
	
	public CategoriesManager() {
		categories = new ArrayList<>();
	}
	public void addCategory(Categories category) {
		categories.add(category);
		System.out.println("Category added");
	}
	public void deleteCategory(Categories category) {
		categories.remove(category);
		System.out.println("Category deleted");
	}
	public List<Categories> getAll(){
		return categories;
	}

}