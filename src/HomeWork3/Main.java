package HomeWork3;

import HomeWork1.InOut;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag){
            System.out.println("1. Задан целочисленный список ArrayList.\n" +
                    "Найти минимальное, максимальное и среднее арифметическое из этого списка.\n" +
                    "2. Пусть дан произвольный список целых чисел, удалить из него четные числа\n" +
                    "3.* Реализовать алгоритм сортировки слиянием\n");
            switch (InOut.inputIntData()) {
                case 1:
                    Scripts.findMinMaxAverage();
                    break;
                case 2:
                    Scripts.delOddNumber();
                    break;
                case 3:
                    Scripts.mergeSort();
                    break;
                case 0:
                    flag = false;
                    System.out.println("Спасибо, что использовали наше ПО))");
                    break;
                default:
                    System.out.println("Нет такой задачи.");
            }
            System.out.println();
        }
    }
}
