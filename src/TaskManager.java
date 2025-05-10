import java.util.*;
import java.io.*;

public class TaskManager {
    private static final List<Task> tasks = new ArrayList<>();
    private static final String FILE = "data/tasks.csv";

    public static void addTask(Task task) {
        tasks.add(task);
    }

    public static void listTasks() {
        if (tasks.isEmpty()) System.out.println("No tasks found.");
        else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public static void updateTask(int index, Task updatedTask) {
        tasks.set(index, updatedTask);
    }

    public static void deleteTask(int index) {
        tasks.remove(index);
    }

    public static List<Task> getTasks() {
        return tasks;
    }

    public static void saveToCSV() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE))) {
            for (Task task : tasks) {
                writer.println(task.getTitle() + "," + task.getDescription() + "," + task.getDueDate() + "," + task.isCompleted());
            }
        } catch (IOException e) {
            System.out.println("Error saving to CSV.");
        }
    }

    public static void loadFromCSV() {
        tasks.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",", -1);
                if (parts.length == 4) {
                    String title = parts[0];
                    String desc = parts[1];
                    String due = parts[2];
                    boolean done = Boolean.parseBoolean(parts[3]);
                    tasks.add(new Task(title, desc, due, done));
                }
            }
        } catch (IOException e) {
            System.out.println("No previous task data found.");
        }
    }
}

