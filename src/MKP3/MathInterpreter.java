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

    public int interpret(int a, int b) {
        return vuraz.interpret(a, b);
    }
}
