import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /**
         4. Напишите класс, который принимает с клавиатуры две
         переменный это два числа, пока не будет введено две одинаковых
         чисел.
         Класс должен выводить на экран сумму всех первых чисел и сумму
         всех вторых чисел (не считая чисел, введенных одинаковыми).
         */
        Scanner scanner = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        int sumFirstNumbers = 0;
        int sumSecondNumbers = 0;

        do {
            System.out.print("Vvedite pervoe chislo: ");
            firstNumber = scanner.nextInt();

            System.out.print("Vvedite vtoroe chislo: ");
            secondNumber = scanner.nextInt();

            sumFirstNumbers += firstNumber;
            sumSecondNumbers += secondNumber;
        } while (firstNumber != secondNumber);

        System.out.println("Summa vseh pervyh chisel: " + sumFirstNumbers);
        System.out.println("Suuma vseh vtoryh chisel: " + sumSecondNumbers);

        scanner.close();
    }
}
