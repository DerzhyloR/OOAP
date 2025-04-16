package MKP3;

public class MathInterpreter {
    private Vuraz vuraz;

    public MathInterpreter(String operation) {
        switch (operation) {
            case "Додавання":
                vuraz = new AdditionTask();
                break;
            case "Віднімання":
                vuraz = new SubtractionTask();
                break;
        }
    }
}
