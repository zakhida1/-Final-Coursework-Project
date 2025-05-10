public class ReportGenerator {
    public static void generateReport() {
        long done = TaskManager.getTasks().stream().filter(Task::isCompleted).count();
        long pending = TaskManager.getTasks().size() - done;
        System.out.println("----- Task Report -----");
        System.out.println("Total Tasks: " + TaskManager.getTasks().size());
        System.out.println("Completed: " + done);
        System.out.println("Pending: " + pending);
    }
}
