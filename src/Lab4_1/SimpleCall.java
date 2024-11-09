package Lab4_1;

public class SimpleCall implements Phone{
    @Override
    public void makeCall() {
        System.out.println("\nЗдійснився простий виклик без камери");
    }
}
