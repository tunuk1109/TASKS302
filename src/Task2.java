import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        /**
         2. Напишите класс, который генерирует 20 рандомных целых чисел
         из диапазона -50 до +50, и определяет наименьшее число и
         наибольшее число.
         - Нельзя использовать массив
         */

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            int randomNumber = rand.nextInt(101) - 50;
            System.out.println("Sluchainoe chislo " + (i + 1) + ": " + randomNumber);
            min = Math.min(min, randomNumber);
            max = Math.max(max, randomNumber);
        }

        System.out.println("Naibol'shoe chislo: " + max);
        System.out.println("Naimen'shee chislo: " + min);


            }
        }

