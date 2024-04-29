import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        /**
         10. Напишите класс, который заполняет случайными двузначными
         числами массив, размер которого вводится с клавиатуры.
         После заполнения класс должен вывести на экран значения
         массива следующим образом:
         ● в первой строке - первую половину массива
         ● во второй строке - вторую половину массива
         */


        Scanner scanner = new Scanner(System.in);

        System.out.print("Vvedite razmer massiva: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = 10 + rand.nextInt(90);
        }

        System.out.println("Pervaya polovina massiva:");
        printArray(array, 0, size / 2);
        System.out.println("\n Vtoraya polovina massiva:");
        printArray(array, size / 2, size);

        scanner.close();
    }
    public static void printArray(int[] array, int startIndex, int endIndex) {
        for (int i = startIndex; i < endIndex; i++) {
            System.out.print(array[i] + " ");
        }


    }
}
