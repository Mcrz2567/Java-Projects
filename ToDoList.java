package todolist;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
	private List<Task> tasks;
	
	public ToDoList() {
		this.tasks = new ArrayList<>();
	}
	
	public void addTask(String description) {
		tasks.add(new Task(description));
	}
	public void removeTask(int index) {
		if (index >= 0 && index < tasks.size()) {
			tasks.remove(index);
		}
		else {
			System.out.println("Invalid index. Task not removed");
		}
	}
	
	public void markTaskCompleted(int index) {
		if(index >= 0 && index < tasks.size()) {
			tasks.get(index).markDone();
		}
		else {
			System.out.println("Invalid index. Task not marked as completed;");
		}
	}
	
	public List<Task> getTasks(){
		return tasks;
	}
	
	public void printTasks() {
		if (tasks.isEmpty())
		{
			System.out.println("To-Do List is Empty");
		}
		else {
		for (int i = 0; i < tasks.size(); i++ ) {
			System.out.println((i+1) + ". " + tasks.get(i)); //potentially could use for-each loop; however, keywords and List<Task> uses keyword, therefore for loop is used to get output for To Do List
		}
	}
}
}


