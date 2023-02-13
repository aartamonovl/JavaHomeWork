package HomeWork1;

import java.util.*;

//import java.math.*;
public class Scripts { //Класс с вычислениями для задач
    public static void triangleNumber() { // Нахождение треугольного числа
        int n = InOut.inputIntData();
        System.out.printf("Треугольное число от %d = %d\n", n, n * (n + 1) / 2);
    }

    public static void getFactorial() { // Нахождение факториала
        int n = InOut.inputIntData();
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        System.out.printf("Факториал числа %d = %d\n", n, res);
    }

    public static void getSimpleNumbers() { // Нахождение простых чисел от 1 до 1000
        int minValue = 1;
        int maxValue = 1000;
        List<Integer> list = new ArrayList<Integer>();
        while (minValue < maxValue + 1) {
            if (isSimple(minValue)) {
                list.add(minValue);
            }
            minValue++;
        }
        System.out.println(list);
    }

    private static boolean isSimple(int n) { // Проверка на простое число
        if (n < 4) return true;
        if (n % 2 == 0)
            return false;
        else {
            for (int i = 3; i <= Math.sqrt(n); i += 2) {
                if (n % i == 0)
                    return false;
            }
        }
        return true;
    }

    public static void easyCalc() { // Вычисление простого выражения
        int num1 = InOut.inputIntData();
        int num2 = InOut.inputIntData();
        String operator = InOut.inputOperator();
        System.out.printf("%d %s %d = %.4f\n", num1, operator, num2, calc(num1, num2, operator));
    }

    private static double calc(int num1, int num2, String operator) { // Калькулятор простых операций
        double result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0)
                    result = num1 / num2;
                else
                    System.out.println("На 0 делить нельзя");
                break;
            default:
                System.out.println("Оператор не распознан");
        }
        return result;
    }

    public static void findNoneDigitInExpr() { // Нахождение решения уравнений вида 2? + ?5 = 67
        String q_str = InOut.inputStrData();
        String w_str = InOut.inputStrData();
        String e_str = InOut.inputStrData();
        boolean flag = true;
        for (int i = 0; i < 10; i++) {
            int q_num = Integer.parseInt(q_str.replace("?", Integer.toString(i)));
            for (int j = 0; j < 10; j++) {
                int w_num = Integer.parseInt(w_str.replace("?", Integer.toString(j)));
                for (int k = 0; k < 10; k++) {
                    int e_num = Integer.parseInt(e_str.replace("?", Integer.toString(k)));
                    if (q_num + w_num == e_num) {
                        System.out.printf("Решение уравнения %s + %s = %s => %d + %d = %d\n", q_str, w_str, e_str, q_num, w_num, e_num);
                        flag = false;
                        break;
                    }
                }
                if (flag == false) break;
            }
            if (flag == false) break;
        }
        if (flag) System.out.println("Решений нет!");
    }
}

