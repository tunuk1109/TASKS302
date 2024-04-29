import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        /**
         7. Напишите класс, который принимает с клавиатуры целое число
         любой длины и строит из него число с обратным порядком цифр.
         Новое значение следует вывести в консоль.
         */

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int reversedNumber = reverseNumber(number);
        System.out.println("Сhislo s obratnym poryadkom: " + reversedNumber);

        scanner.close();
    }
    public static int reverseNumber(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;

    }
}
