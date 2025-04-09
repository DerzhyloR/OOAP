package Lab7;

public class LayoutDesigner extends TaskHandler{
    @Override
    public void handleTask(String task) {
        if (task.equalsIgnoreCase("оформлення макету")) {
            System.out.println("Макетувальник виконує завдання: " + task);
        } else if (nextHandler != null) {
            nextHandler.handleTask(task);
        } else {
            System.out.println("Завдання \"" + task + "\" ніхто не може обробити!");
        }
    }
}
