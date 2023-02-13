package HomeWork1;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag){
            System.out.println("1. Вычислить n-ое треугольное число.\n" +
                    "2. Вычислить факториал числа.\n" +
                    "3. Вывести все простые числа от 1 до 1000\n" +
                    "4. Простой калькулятор.\n" +
                    "5. *+Задано уравнение вида q + w = e, q, w, e >= 0.\nНекоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.\n" +
                    "Требуется восстановить выражение до верного равенства.\nПредложить хотя бы одно решение или сообщить, что его нет.\n" +
                    "0.Выход.\n");
            switch (InOut.inputIntData()){
                case 1:
                    Scripts.triangleNumber();
                    break;
                case 2:
                    Scripts.getFactorial();
                    break;
                case 3:
                    Scripts.getSimpleNumbers();
                    break;
                case 4:
                    Scripts.easyCalc();
                    break;
                case 5:
                    Scripts.findNoneDigitInExpr();
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Нет такой задачи.");
            }
        }
    }
}