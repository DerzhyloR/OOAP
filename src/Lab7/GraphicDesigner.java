package Lab7;

public class GraphicDesigner extends TaskHandler{
    @Override
    public void handleTask(String task) {
        if (task.equalsIgnoreCase("створення дизайну")) {
            System.out.println("Дизайнер виконує завдання: " + task);
        } else if (nextHandler != null) {
            nextHandler.handleTask(task);
        } else {
            System.out.println("Завдання \"" + task + "\" ніхто не може обробити!");
        }
    }
}
