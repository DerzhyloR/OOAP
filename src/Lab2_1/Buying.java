package Lab2_1;

import java.util.HashMap;
import java.util.Map;

public class Buying {
    Map<String,Facade> ordering=new HashMap<>();
    String materials[]={"Плівковий","Фарбований","Пластиковий"};

    public void addNewFacade(Facade facade){
        ordering.put(facade.getMaterial(),facade);
    }

    public void outputOrdering(){
        for(int i=0;i<materials.length;i++) {
            int kilkist=0;
            double totalPrice=0;
            for (Map.Entry<String,Facade>facade:ordering.entrySet()) {
                if(facade.getValue().getMaterial().equals(materials[i])){
                    System.out.println("Тип фасаду: "+facade.getValue().getTypeFacade()+"\tРозмір: "+facade.getValue().getSize()+" кв.м"+
                            "\tМатеріал:"+facade.getValue().getMaterial()+"\tЦіна: "+facade.getValue().getPrice()+" грн");
                    kilkist++;
                    totalPrice+=facade.getValue().getPrice();
                }
            }
            if(kilkist!=0){
                System.out.println("Загальна ціна замовдення: "+totalPrice+" грн");
                System.out.println("---------------------------------------------------");
            }
        }
    }



}
