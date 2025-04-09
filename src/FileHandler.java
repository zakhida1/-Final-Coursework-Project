import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
    private static final String FILE_NAME = "tasks.txt";

    public static void saveTasks(List<Task> tasks) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Task task : tasks) {
                writer.write(task.getTitle() + "|" + task.getDescription() + "|" + task.isCompleted() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении задач: " + e.getMessage());
        }
    }

    public static List<Task> loadTasks() {
        List<Task> tasks = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split("\\|");
                String title = data[0];
                String description = data[1];
                boolean isCompleted = Boolean.parseBoolean(data[2]);
                tasks.add(new Task(title, description));
            }
        } catch (IOException e) {
            System.out.println("Ошибка при загрузке задач: " + e.getMessage());
        }
        return tasks;
    }
}

