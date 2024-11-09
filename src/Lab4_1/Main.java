package Lab4_1;

import java.util.Scanner;

public class Main {
    private static Scanner scanner= new Scanner(System.in);
    public static void main(String [] args){
        while (true) {
            int choose = getDataInt("\nВиберіть який зробити виклик:\n1.Простий\n2.З камерою\nВаш вибір: ");
            if (choose == 1) {
                callWithoutCamera();
            } else {
                cameraCall();
            }
            boolean value=isContinue("\nЗробити новий виклик?\ny-Так\nn-Ні\nВаш вибір: ");
            if(!value){
                break;
            }
        }
    }

    private static void callWithoutCamera(){
        Phone phone= new SimpleCall();
        phone.makeCall();
    }

    private static void cameraCall(){
        VideoCamera video= new VideoCamera();
        Phone phone= new CallWithCamera(video);
        phone.makeCall();
    }

    public static int getDataInt(String txt){
        while (true){
            try {
                System.out.println(txt);
                int chyslo=scanner.nextInt();
                scanner.nextLine();
                if(chyslo>0 && chyslo<3){
                    return chyslo;
                }
                else{
                    System.out.println("ПОМИЛКА ВИБОРУ! Повторіть спробу");
                }
            }catch (Exception e){
                System.out.println("ПОМИЛКА ВВОДУ! Повторіть спробу");
                scanner.next();
            }
        }
    }
    public static boolean isContinue(String txt){
        boolean isCon=false;
        while (true) {
            System.out.println(txt);
            String res = scanner.nextLine();
            if (res.toLowerCase().equals("y")) {
                isCon = true;
                break;
            } else if(res.toLowerCase().equals("n")) {
                isCon = false;
                break;
            }
            else {
                System.out.println("Помилка вибору! Повторіть спробу");
            }
        }
        return isCon;
    }
}
