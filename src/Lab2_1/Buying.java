package Lab2_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Buying {
    Map<String,Facade> ordering=new HashMap<>();
    String materials[]={"Плівковий","Фарбований","Пластиковий"};

    public void addNewFacade(Facade facade){
        ordering.put(facade.getMaterial(),facade);
    }

    public void outputOrdering(){
        for(int i=0;i<materials.length;i++) {
            for (Map.Entry<String,Facade>facade:ordering.entrySet()) {

            }
        }
    }



}
