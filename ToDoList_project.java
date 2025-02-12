package todolist; 
import java.util.List; //implementation of List from Java library
import java.util.ArrayList; //implementation of Array List from Java library

/*public class Task {   //public class Task is initiated in another file due to class being public
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
}  */
/*public class ToDoList{    // public class ToDoList is initiated in another file due to class being public
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
} */
	//Main class/constructor will run To-Do List
	public class ToDoList_project{
	public static void main(String[] args) {
		ToDoList todoList = new ToDoList();
		todoList.addTask("Completed Java projects");
		todoList.addTask("Review Data Structures");
		todoList.addTask("Completed homework");
		todoList.addTask("Review topics for Engineering Career Fair");
		todoList.addTask("Polish resume for Career fair");
		todoList.addTask("Taken Operating Systems class");
		todoList.addTask("Master at Java");
		
		todoList.markTaskCompleted(0);
		
		System.out.println("Current To-Do List:");
		todoList.printTasks();
		
		
		

	}

}
