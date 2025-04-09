package Lab7;

public class Editor extends TaskHandler{
    @Override
    public void handleTask(String task) {
        if (task.equalsIgnoreCase("внесення правок")) {
            System.out.println("Редактор виконує завдання: " + task);
        } else if (nextHandler != null) {
            nextHandler.handleTask(task);
        } else {
            System.out.println("Завдання \"" + task + "\" ніхто не може обробити!");
        }
    }
}
