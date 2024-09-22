package Lab2_1;

import java.util.List;
import java.util.ArrayList;

public class Buying {
    List<Facade> ordering=new ArrayList<>();
    String materials[]={"Плівковий","Фарбований","Пластиковий"};

    public void addNewFacade(Facade facade){
        ordering.add(facade);
    }

    public void outputOrdering(){
        System.out.println("---------------------------------------------------");
        for(int i=0;i<materials.length;i++) {
            int kilkist=0;
            double totalPrice=0;
            for (Facade facade:ordering) {
                if(facade.getMaterial().equals(materials[i])){
                    System.out.format("Тип фасаду: %-10s\tРозмір: %-8.2f кв.м\tМатеріал: %-10s\tЦіна: %-10.2f грн",
                            facade.getTypeFacade(),facade.getSize(),facade.getMaterial(),facade.getPrice());
                    System.out.println();
                    kilkist++;
                    totalPrice+=facade.getPrice();
                }
            }
            if(kilkist!=0){
                System.out.println("Загальна ціна замовлення: "+totalPrice+" грн");
                System.out.println("---------------------------------------------------");
            }
        }
    }



}
