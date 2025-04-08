package Lab5;

import java.util.List;

public class Facade {
    public void compareStrengthCharacters(Character main, List<Character> others) {
        System.out.println("\nРІЗНИЦЯ В CИЛАХ:");
        for (Character other : others) {
            if (main == other) continue;
            String result="";
            if(main.getStrength() > other.getStrength()){
                result="сильніший за ";
            }
            else if(main.getStrength() < other.getStrength()){
                result="слабший за ";
            }
            else{
                result="рівний з ";
            }
            System.out.println(main.getName() + " " + result + other.getName());
        }
    }
}
