// 2 Создать множество ноутбуков.

// 3 Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и 
// выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …

// 4 Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

// 5 Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Laptops {

    public static void main(String[] args) {

        Set<Laptop> laptop = new HashSet<>();

        laptop.add(new Laptop("Ноутбук DEXP Aquilon", 8, 500, "Windows", "black"));
        laptop.add(new Laptop("Ноутбук Digma EVE 14 C414", 4, 350, "Linux", "white"));
        laptop.add(new Laptop("Ноутбук Irbis NB282", 8, 500, "Windows", "red"));
        laptop.add(new Laptop("Ноутбук ASUS Laptop 15 D543MA-DM1368", 32, 1000, "Linux", "grey"));

        laptop.add(new Laptop("Ноутбук DEXP Aquilon", 8, 500, "Windows", "black"));
        laptop.add(new Laptop("Ноутбук Echips Envy", 4, 250, "Linux", "red"));
        laptop.add(new Laptop("Ноутбук Digma EVE 15 P417", 16, 350, "Windows", "white"));
        laptop.add(new Laptop("Ноутбук HP 250 G7", 12, 250, "Linux", "black"));

        Map<String, Object> filter = new HashMap<>();
        
        metod(filter);
        
        for (Laptop task1 : laptop) {
            if ((int) filter.get("ОЗУ") >= task1.getOperatingMemory()) {
                System.out.println(task1);
            }
            else if ((int) filter.get("Объем ЖД") >= task1.getHDD()){
                System.out.println(task1);
            }
            else if (filter.get("Операционная система").equals(task1.getOperationSystem())){
                System.out.println(task1);
            }
            else if (filter.get("Цвет").equals(task1.getColor())){
                System.out.println(task1);
            }
        }
    }

    public static void metod(Map<String, Object> filter) {

        filter.put("ОЗУ", 1);
        filter.put("Объем ЖД", 2);
        filter.put("Операционная система", 3);
        filter.put("Цвет", 4); 

        System.out.println(
                "Введите цифру, соответствующую необходимому критерию: \n1 - OЗУ \n2 - Объем ЖД\n3 - Операционная система\n4 - Цвет");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        scanner.nextLine();

        if (number == 1) {
            System.out.print("Введите минимальный объем ОЗУ: ");
            Integer operatingMemory = scanner.nextInt();
            filter.replace("ОЗУ", operatingMemory);
        } else if (number == 2) {
            System.out.print("Введите минимальный объем Объем ЖД: ");
            Integer HDD = scanner.nextInt();
            filter.put("Объем ЖД", HDD);
        } else if (number == 3) {
            System.out.print("Введите название операционной системы: ");
            String operationSystem = scanner.nextLine();
            filter.put("Операционная система", operationSystem);
        } else if (number == 4) {
            System.out.print("Введите название Цвет: ");
            String color = scanner.nextLine();
            filter.put("Цвет", color);
        }
    }
}
