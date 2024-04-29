import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /**
         3. Напишите класс, который принимает с консоли для переменной X
         целое положительное число, а затем дополнительно будет
         спрашивать ещё числа, эти числа будут должны вычитаться из
         переменной x, вы будете вводить числа до тех пор пока X не будет
         отрицательным или равен 0.
         - используйте while loop
         */
    Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite chislo: ");
        int number = scanner.nextInt();

        while (number > 0) {
            System.out.println("Vvedite chislo: ");
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }
            number = num;
            System.out.println("Tekushee znachenie chislo: " + number);
        }
        System.out.println("Proverka zaversherna: ");
        scanner.close();
    }
}
