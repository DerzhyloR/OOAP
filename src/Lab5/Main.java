package Lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        List<Character>allCharacters=new ArrayList<>();
        while (true) {
            int chooseCharacter = getDataInt("Якого героя ви хочете створити?\n1.Людину\n2.Троля\n3.Орка\nВаш вибір: ", 3);
            Character character = chooseCharacter == 1 ? new People() : chooseCharacter == 2 ? new Troll() : new Orc();
            int chooseWeapon = getDataInt("\nЯку зброю ви обираєте?\n1.Кинджал (+20)\n2.Булава (+15)\n3.Сокира (+5)\n4.Меч (+12)\n5.Лук (+9)\nВаш вибір: ", 5);
            int weaponPower = switch (chooseWeapon) {
                case 1 -> 20;
                case 2 -> 15;
                case 3 -> 5;
                case 4 -> 12;
                case 5 -> 9;
                default -> 0;
            };
            character = new DecoratorWeapon(character, weaponPower);
            int chooseArmor = getDataInt("\nОберіть обладунки:\n1.Шкіряний з дерев'янм щитом (+8)\n2.Кольчуга з металевим щитом (+15)\n3.Пластинчастий з металевим щитом (+21)\nВаш вибір: ", 3);
            int armorPower = switch (chooseArmor) {
                case 1 -> 8;
                case 2 -> 15;
                case 3 -> 21;
                default -> 0;
            };
            character = new DecoratorArmor(character, armorPower);
            System.out.println("\nВаш герой готовий!");
            System.out.println("Вид персонажу: " + character.getName());
            System.out.println("Сила: " + character.getStrength());
            System.out.println("Захист: " + character.getDefense());
            allCharacters.add(character);
            int chooseOption=getDataInt("\nДодати нового персонажа?\n1.Так\n2.Ні\nВаш вибір: ",2);
            if (chooseOption==2){
                break;
            }
        }
        while (true) {
            String options = "\nОберіть користувача для порівняння:\n";
            int i = 1;
            for (Character ch : allCharacters) {
                options += i + "." + ch.getName() + "\n";
                i++;
            }
            int id = getDataInt(options, i-1);
            Character selected = allCharacters.get(id - 1);
            Facade facade = new Facade();
            facade.compareStrengthCharacters(selected, allCharacters);
            facade.canKills(selected, allCharacters);
            int isStop=getDataInt("\nЗробити ще порівняння?\n1.Так\n2.Ні\nВаш вибір: ",2);
            if (isStop==2){
                break;
            }
        }


    }

    public static int getDataInt(String txt,int minOptions){
        while (true){
            try {
                System.out.println(txt);
                int chyslo=scanner.nextInt();
                scanner.nextLine();
                if(chyslo>0 && chyslo<=minOptions){
                    return chyslo;
                }
                else{
                    System.out.println("Помилка вибору! Повторіть спробу");
                }
            }catch (Exception e){
                System.out.println("ПОМИЛКА ВВОДУ! Повторіть спробу");
                scanner.next();
            }
        }
    }
}
