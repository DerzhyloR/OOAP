package Lab3;

public class Client {
    private String name;
    private int age;
    private String sex;

    public Client(String name, int age, String sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
    }

    public void getInfo(){
        System.out.println("\nІм'я клієнта: "+name+"\nВік: "+age+"\nСтать: "+sex);
    }

}
