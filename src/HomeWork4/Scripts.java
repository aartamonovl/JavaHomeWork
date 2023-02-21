package HomeWork4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Scripts {
    private static HashMap<String, HashSet<String>> phoneBook = new HashMap<>();
    public static void addStartData (){
        HashSet<String> hs = new HashSet<>();
        hs.add("123456");
        hs.add("654321");
        phoneBook.put("Петров", hs);
        hs.clear();
        hs.add("222222");
        phoneBook.put("Сидоров", hs);
    }

    public static void addPhone (){
        String login = inputLogin();
        String phone = inputPhone();
        if (phoneBook.containsKey(login)){
            phoneBook.get(login).add(phone);
            System.out.printf("Добавление телефона %s к логину %s прошло успешно.", phone, login);
            System.out.println();
        } else {
            HashSet<String> hs = new HashSet<>();
            hs.add(phone);
            phoneBook.put(login, hs);
            System.out.printf("Создание логина %s с телефоном %s к  прошло успешно.", login, phone);
            System.out.println();
        }
        System.out.println(phoneBook);
    }

    public static void delPhone (){
        String login = inputLogin();
        String phone = inputPhone();
        if (phoneBook.containsKey(login)){
            phoneBook.get(login).remove(phone);
            System.out.printf("Удаление телефона %s у логина %s прошло успешно.", phone, login);
            System.out.println();
        } else {
            System.out.println("Логин не найден.");
        }
        System.out.println(phoneBook);
    }

    public static void findByLogin (){
        String login = inputLogin();
        if (phoneBook.containsKey(login)){
            System.out.println("К логину " + login + " привязаны номера " + phoneBook.get(login));
            System.out.println();
        } else {
            System.out.printf("Логин %s не найден.");
            System.out.println();
        }
    }

    public static String inputLogin() {
        System.out.print("Введите логин: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static String inputPhone() {
        System.out.print("Введите телефон: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static Integer inputTask() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите номер задачи: ");
            if (sc.hasNextInt()) {
                return sc.nextInt();
            } else {
                System.out.println("Ошибка. Введите число.");
            }
        }
    }
}
