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