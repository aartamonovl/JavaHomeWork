package HomeWork1;

import java.util.Scanner;

public class InOut {

    public static int inputIntData(){
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (sc.hasNextInt())
                return sc.nextInt();
            else
                System.out.println("Ошибка. Введите число.");
        }
    }
    public static String inputOperator(){
        System.out.print("Введите оператор: ");
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
    public static String inputStrData(){
        System.out.println("Введите число (оно будет в формате строки): ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
        }
}
