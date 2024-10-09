package MKP;

public class ApplicationState {
    private static ApplicationState instance;  //Зберігатиме екземпляр класу
    public String LoginId;
    public double MaxSize;

    public ApplicationState(){
        LoginId="Невідомо";
        MaxSize=0;
    }

    public void setLoginId(String value){
        LoginId=value;
    }
    public void setMaxSize(double size){
        MaxSize=size;
    }

    public String getLoginId(){
        return LoginId;
    }

    public double getMaxSize(){
        return MaxSize;
    }

    public static ApplicationState getInstance() {
        if (instance == null) {
            synchronized (ApplicationState.class) {
                if (instance == null) {
                    instance = new ApplicationState();
                }
            }
        }
        return instance;
    }

}
