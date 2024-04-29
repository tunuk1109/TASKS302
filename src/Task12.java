import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        /**
         12. Создайте не возвращающий метод в параметры которого, вы
         даете массив из целых чисел и еще целое число n.
         Метод должен проверить есть ли в массиве число большее или
         равное n.
         Если есть такое число вывести в консоль true, в другом случае false!
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Napishi chislo massiva; ");
        getNumber(new int[]{scanner.nextInt()}, 9);
    }
    public static void getNumber (int [] array, int num) {
        for (int i = 0; i < array.length; i++) {

            if (array[i] >= num) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

    }
}
