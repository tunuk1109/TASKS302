import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        /**
         6. Напишите класс, который принимает с клавиатуры целое
         положительное число любой длины, а затем выводит его первую
         цифру.
         Например, для числа 7659 на экран будет выведено 7.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Napishi sifru luboi dlinoi: ");
        int number = scanner.nextInt();

        int firstDigit = getFirstDigit(number);
        System.out.println("Pervaya sifra: " + firstDigit);

        scanner.close();
    }
    public static int getFirstDigit(int number) {
        number = Math.abs(number);
        if (number < 10) {
            return number;
        }
        while (number >= 10) {
            number /= 10;
        }
        return number;

        }
    }

