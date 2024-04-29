import java.util.Random;

public class Task15 {
    public static void main(String[] args) {
        /**
         15. Напишите не возвращающий метод, который берет массив из
         рандомных чисел от 1 до 50 и еще одно целое число n.
         Нужно вывести в консоль сколько раз число n повторялось в
         массиве.
         */
        int[] array = generateRandomArray(10);
        int n = 7;
        countOccurrences(array, n);
    }
    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(50) + 1;
        }
        return array;
    }
    public static void countOccurrences(int[] array, int n) {
        int count = 0;
        for (int num : array) {
            if (num == n) {
                count++;
            }
        }
        System.out.println("Chislo " + n + " povtoryaetsya v massive = " + count + " raza");
    }
}


