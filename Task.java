package todolist;

public class Task{

	private String description;
	private boolean taskDone;
	
	public Task(String description) 
	{ 
		this.description = description; // this. variable used to create reference to variable
		this.taskDone = false;
	}
	public void markDone() {
		this.taskDone = true;
	}
	public String getDescription(){ // non-void methods return values of variables
		return description;
	}
	public boolean isTaskDone() {
		return taskDone;
	}
	@Override  // let's program know object method is to be overrided. Doing this allows for tasks to be completed or uncompleted when adding tasks in Array List
	public String toString() {
		return (taskDone ? "[✓] " : "[X] " + description); // + description appends description to the To Do List being either completed or not completed
		
	}

	}

