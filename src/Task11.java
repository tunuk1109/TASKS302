import java.util.Random;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /**
         11. Напишите класс, который заполняет случайными двузначными
         числами массив, размер которого вводится с клавиатуры.
         После заполнения класс должен вывести на экран значения
         массива следующим образом:
         ● в первой строке – четные значения, содержащиеся в массиве
         ● во второй строке – нечетные значения, содержащиеся в
         массиве
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Napishi dvuhznachnuyu chislo; ");
        int size = scanner.nextInt();

        int [] array = new int [size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = 10 + random.nextInt(90);
        }
        System.out.print("Chetnye chisla massiva: ");
        getChetnyeValue(array);
        System.out.println();
        System.out.print("Nechetnye chisla massiva: ");
        getNechetnyeValue(array);
    }
    public static void getChetnyeValue (int [] array) {
        for (int value : array) {
            if (value % 2 == 0) {
                System.out.print(value + " ");
            }
        }
    }
    public static void getNechetnyeValue (int[] array) {
        for (int value : array) {
            if (value % 2 != 0) {
                System.out.print(value + " ");
            }
        }
    }
}
