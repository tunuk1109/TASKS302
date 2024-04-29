import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        /**
         5.    5. Напишите класс, который принимает с клавиатуры целое число
         любой длины и выводит на экран:
         ● в первой строке - все четные цифры этого числа, через пробел
         ● во второй строке - все нечетные цифры этого числа, через
         пробел
         Например, для числа 765873 в первой строке будет выведены числа
         6 8, а во второй строке 7 5 7 3
         - Нельзя использовать массив
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Vvedite chisla: ");
        int number = scanner.nextInt();

        String numberString = Integer.toString(number);

        StringBuilder chetnyeSifry = new StringBuilder();
        StringBuilder nechetnyeSifry = new StringBuilder();

        for (int i = 0; i < numberString.length(); i++) {
            char digitChar = numberString.charAt(i);
            int digit = Character.getNumericValue(digitChar);
            if (digit % 2 == 0) {
                chetnyeSifry.append(digit).append(" ");
            } else {
                nechetnyeSifry.append(digit).append(" ");
            }
        }
        System.out.println("Chetnye sifry: " + chetnyeSifry.toString().trim());
        System.out.println("Nechetnye sifry: " + nechetnyeSifry.toString().trim());

        scanner.close();

    }
}