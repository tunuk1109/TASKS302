import java.util.Random;

public class Task14 {
    public static void main(String[] args) {
        /**
         14. Напишите не возвращающий метод который в параметры берет
         массив из рандомных чисел от 1 до 50 и выводит в консоль только
         те числа что больше 20.
         */
        int[] array = generateRandomArray(10);
        printNumbersGreaterThan20(array);
    }
    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(50) + 1;
        }
        return array;
    }
    public static void printNumbersGreaterThan20(int[] array) {
        System.out.println("Chisla bol'she 20 chislo:");
        for (int number : array) {
            if (number > 20) {
                System.out.print(number + " ");

            }
        }
    }
}
