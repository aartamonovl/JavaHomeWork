package HomeWork3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Scripts {
    public static void findMinMaxAverage(){
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 1, 2, 55));
        System.out.println(list);
        int min = list.get(0);
        int max = list.get(0);
        double average = 0;
        for (int i: list){
            if (i < min)
                min = i;
            else if (i > max)
                max = i;
            average += i;
        }
        average /= list.size();
        System.out.printf("min: %d; max: %d; average: %.2f.", min, max, average);
    }
    public static void delOddNumber (){
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 1, 2, 55, 111, 112));
        list.removeIf(i -> i%2==0);
        System.out.println(list);
    }

    public static void mergeSort (){
        int[] array = new int[] {2,1,5,6,1,9,5,6,111,110,3,88};
        showArray(array);
        int[] arrayA = new int[array.length];
        int[] arrayB = new int[array.length];
        boolean isSorted;
        int iStartA, iStartB, iEndA, iEndB;
        int maxLen = array.length;

        while (true){
            isSorted = true;
            iStartA = 0;
            iStartB = 0;
            iEndA = 0;
            iEndB = 0;
            arrayA[iStartA++] = array[0];
            for (int index = 1; index < maxLen; index++){
                if (array[index] < array[index - 1]){
                    arrayA[iStartA++] = array[index];
                    iEndA = iStartA;
                    isSorted = false;
                } else {
                    arrayB[iStartB++] = array[index];
                    iEndB = iStartB;
                }
            }
            if (isSorted){
                showArray(array);
                break;
            }
            iStartA = 0;
            iStartB = 0;
            for (int index = 0; index < maxLen; index++){
                if (iStartA == iEndA){
                    array[index] = arrayB[iStartB++];
                    continue;
                }
                if (iStartB == iEndB){
                    array[index] = arrayA[iStartA++];
                    continue;
                }
                if (arrayA[iStartA] <= arrayB[iStartB]){
                    array[index] = arrayA[iStartA++];
                } else {
                    array[index] = arrayB[iStartB++];
                }
            }
        }
    }
    private static void showArray(int[] array){
        for (int item: array){
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
