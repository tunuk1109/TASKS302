import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        /**
         9. Напишите класс, который заполняет случайными
         четырехзначными числами массив, размер которого вводится с
         клавиатуры.
         После заполнения класс должен вывести на экран значения
         массива в одной строке, начиная с конца массива ( с последнего
         индекса).
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Vvedite razmer massiva: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = 1000 + rand.nextInt(9000);

            System.out.println("Randomnye chisla: " + array[i]);
        }

        System.out.println("Masaiv v obratnom poryadke:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        scanner.close();
    }
}
