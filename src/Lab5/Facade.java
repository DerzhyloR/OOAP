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

    public void canKills(Character attacker, List<Character> targets) {
        System.out.println("\nМОЖЕ ПОБИТИ " + attacker.getName() + ":");
        int attack = attacker.getStrength();
        for (Character target : targets) {
            if (attacker == target) continue;
            int defense = target.getDefense();
            for (int hits : new int[]{1, 5, 10}) {
                if (attack * hits > defense) {
                    System.out.println(target.getName() + " за " + hits + " удар");
                    break;
                }
            }
        }
    }
}
