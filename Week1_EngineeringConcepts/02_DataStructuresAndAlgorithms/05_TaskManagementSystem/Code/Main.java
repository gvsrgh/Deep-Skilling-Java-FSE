public class Main {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        taskList.addTask(new Task(1, "Write report", "Pending"));
        taskList.addTask(new Task(2, "Email client", "Completed"));
        taskList.addTask(new Task(3, "Prepare slides", "In Progress"));

        System.out.println("All Tasks:");
        taskList.traverseTasks();

        System.out.println("\nSearching for Task with ID 2:");
        Task found = taskList.searchTask(2);
        if (found != null) {
            System.out.println(found);
        } else {
            System.out.println("Task not found.");
        }

        System.out.println("\nDeleting Task with ID 1:");
        if (taskList.deleteTask(1)) {
            System.out.println("Task deleted.");
        } else {
            System.out.println("Task not found.");
        }

        System.out.println("\nTasks after deletion:");
        taskList.traverseTasks();
    }
}