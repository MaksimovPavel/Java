import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

//Пусть дан произвольный список(ArrayList) целых чисел, удалить из него четные числа.
/*
public class HW3 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(HW3.class.getName());
        List<Integer> myList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));
        myList.removeIf(i -> i % 2 == 0);
        System.out.println(myList);
        logger.log(Level.INFO, "Done");
    }
}


//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
public class HW3 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(HW3.class.getName());
        List<Integer> list = new ArrayList<>(List.of(9, 11, 22, 66, 1, 15));
        System.out.println(list);
        max_min_avg(list);
        logger.log(Level.INFO, "Done");
    }

    public static void max_min_avg(List<Integer> a) {
        int max = a.get(0);
        int min = a.get(0);
        int sum = 0;
        for (int i : a) {
            sum += i;
            if (max < i) {
                max = i;
            } else if (min > i) {
                min = i;
            }
        }
        float avg = (float) sum / (float) a.size();
        System.out.printf("Максимальное число = %d, минимальное = %d, среднее арифметическое = %.2f\n", max, min, avg);
    }
}
*/

//Реализовать алгоритм сортировки слиянием
public class HW3 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(HW3.class.getName()); 
        int[] list = {6, 9, 2, 4, 1};
        int[] result = sortArray(list);
        for (int i : result) {
            System.out.print(i + " ");
        }
        System.out.println();
        logger.log(Level.INFO, "Done");
    }

    public static int[] sortArray(int[] array) {
        if (array == null) {
            return null;
        }
        if (array.length < 2) {
            return array;
        }

        int[] arrayB = new int[array.length / 2];
        System.arraycopy(array, 0, arrayB, 0, array.length / 2);

        int[] arrayC = new int[array.length - arrayB.length];
        System.arraycopy(array, arrayB.length, arrayC, 0, array.length - arrayB.length);

        sortArray(arrayB);
        sortArray(arrayC);

        mergeArray(array, arrayB, arrayC);

        return array;
    }

    public static void mergeArray(int[] array, int[] arrayB, int[] arrayC) {

        int positionB = 0;
        int positionC = 0;

        for (int c = 0; c < array.length; c++) {
            if (positionB == arrayB.length) {
                array[c] = arrayC[positionC];
                positionC++;
            } else if (positionC == arrayC.length) {
                array[c] = arrayB[positionB];
                positionB++;
            } else if (arrayB[positionB] < arrayC[positionC]) {
                array[c] = arrayB[positionB];
                positionB++;
            } else {
                array[c] = arrayC[positionC];
                positionC++;
            }
        }
    }
}
