# Hands-On Exercise: Task Management System

## Scenario
You are developing a task management system where tasks need to be added, deleted, and traversed efficiently.

## Steps
1.	Understand Linked Lists:
    *	Explain the different types of linked lists (Singly Linked List, Doubly Linked List).
2.	Setup:
    *	Create a class Task with attributes like taskId, taskName, and status.
3.	Implementation:
    *	Implement a singly linked list to manage tasks.
    *	Implement methods to add, search, traverse, and delete tasks in the linked list.
4.	Analysis:
    *	Analyze the time complexity of each operation.
    *	Discuss the advantages of linked lists over arrays for dynamic data.

### Task Class Implementation
```java
public class Task {
    int taskId;
    String taskName;
    String status;

    public Task(int taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{" +
               "ID=" + taskId +
               ", Name='" + taskName + '\'' +
               ", Status='" + status + '\'' +
               '}';
    }
}
```

### TaskLinkedList Class Implementation
```java
public class TaskLinkedList {
    private class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    private Node head;

    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    public Task searchTask(int taskId) {
        Node curr = head;
        while (curr != null) {
            if (curr.task.taskId == taskId) {
                return curr.task;
            }
            curr = curr.next;
        }
        return null;
    }

    public void traverseTasks() {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.task);
            curr = curr.next;
        }
    }

    public boolean deleteTask(int taskId) {
        if (head == null) return false;
        if (head.task.taskId == taskId) {
            head = head.next;
            return true;
        }

        Node curr = head;
        while (curr.next != null && curr.next.task.taskId != taskId) {
            curr = curr.next;
        }

        if (curr.next == null) return false;

        curr.next = curr.next.next;
        return true;
    }
}
```

### Main Class Implementation
```java
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
```

## Output

![Task Management System Output](./Output/Output.png)

### Explain the different types of linked lists (Singly Linked List, Doubly Linked List)
- **Singly Linked List**: A data structure where each element (node) contains a value and a reference to the next node in the sequence. It allows for efficient insertion and deletion of nodes but only allows traversal in one direction (from head to tail).
- **Doubly Linked List**: Similar to a singly linked list, but each node contains references to both the next and previous nodes. This allows for traversal in both directions (forward and backward) and makes certain operations, like deletion of a node, more efficient since you can access the previous node directly.