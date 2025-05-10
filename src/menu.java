import java.util.Scanner;

public class Menu {
    private static final Scanner scanner = new Scanner(System.in);

    public static void show() {
        TaskManager.loadFromCSV();

        while (true) {
            System.out.println("\nTask Organizer List");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Update Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Generate Report");
            System.out.println("6. Save & Exit");
            System.out.print("Choose: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> add();
                case "2" -> TaskManager.listTasks();
                case "3" -> update();
                case "4" -> delete();
                case "5" -> ReportGenerator.generateReport();
                case "6" -> {
                    TaskManager.saveToCSV();
                    System.out.println("Saved. Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private static void add() {
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Description: ");
        String desc = scanner.nextLine();
        System.out.print("Due Date (YYYY-MM-DD): ");
        String due = scanner.nextLine();
        TaskManager.addTask(new Task(title, desc, due, false));
        System.out.println("Task added.");
    }

    private static void update() {
        TaskManager.listTasks();
        System.out.print("Enter task number to update: ");
        int i = Integer.parseInt(scanner.nextLine()) - 1;
        System.out.print("New title: ");
        String title = scanner.nextLine();
        System.out.print("New description: ");
        String desc = scanner.nextLine();
        System.out.print("New due date: ");
        String due = scanner.nextLine();
        System.out.print("Completed? (true/false): ");
        boolean done = Boolean.parseBoolean(scanner.nextLine());
        TaskManager.updateTask(i, new Task(title, desc, due, done));
        System.out.println("Task updated.");
    }

    private static void delete() {
        TaskManager.listTasks();
        System.out.print("Enter task number to delete: ");
        int i = Integer.parseInt(scanner.nextLine()) - 1;
        TaskManager.deleteTask(i);
        System.out.println("Task deleted.");
    }
}
