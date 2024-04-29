import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        /**
         1. Напишите класс, который создает 20 случайных чисел диапазона
         1 - 99. Следует вывести в консоль только те числа которые делятся
         на 1-ое рандомное число без остатка.
         - Нельзя использовать массив.
         */

        Random rand = new Random();

        int firstRandomNumber = rand.nextInt(99) + 1;
        System.out.println("1-oe sluchainoe chislo: " + firstRandomNumber);
        System.out.println("Chisla delyusheesya na " + firstRandomNumber + " bez ostatka:");

        int count = 0;
        while (count < 20) {
            int randomNumber = rand.nextInt(99) + 1;
            if (randomNumber % firstRandomNumber == 0) {
                System.out.print(" " + randomNumber);
                count++;
            }

        }

    }
}
