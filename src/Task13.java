import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        /**
         13. Напишите не возвращающий метод, который берет в параметры
         массив из boolean типа, и выводит в консоль количество true
         элементов массива.
         */
        boolean [] booleans = {true, true, true, false, true, true, false, false, true, false, true};
        getTrue(booleans);

    }
    public static void getTrue(boolean [] booleans) {
        System.out.println(booleans.length);

        int countTrue = 0;
        for (boolean element : booleans) {
            if (element)
            countTrue++;

        }
        System.out.println("Kolichestvo elementov true v massive " + countTrue);
    }
}
