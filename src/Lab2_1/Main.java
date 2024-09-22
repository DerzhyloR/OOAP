package Lab2_1;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){


    }

    public FacadeFactory chooseMaterial(int number){
        FacadeFactory factory = null;
        switch (number) {
            case 1:
                factory = new Film();
                break;
            case 2:
                factory = new Painted();
                break;
            case 3:
                factory = new Plastic();
                break;
        }
        return factory;
    }

    public Facade chooseType(int number,FacadeFactory factory,double width, double height){
        Facade facade = null;
        if (number == 1) {
            facade = factory.solidFacade(width, height);
        } else if (number == 2) {
            facade = factory.storeFrontFacade(width, height);
        }
        return facade;
    }
}
