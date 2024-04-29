import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        /**
         8. На спектакль в кассу театра было выделено определенное
         количество билетов, и продажа осуществлялась до тех пор, пока не
         были проданы все билеты.
         Напишите класс, который сначала принимает с клавиатуры
         количество билетов, переданных в кассу. Затем класс принимает с
         клавиатуры серию чисел, каждое из которых указывает на число
         билетов, которое желает приобрести покупатель.
         Если нет возможности продать очередному покупателю требуемое
         им число билетов, принимается заказ от следующего покупателя.
         Класс должен вывести в консоль:
         ● Какое число покупателей приобрели билеты
         ● Какому числу покупателей было отказано в продаже билетов
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Vvedite kolicgestvo biletov, prodannyh v kasse: ");
        int totalTickets = scanner.nextInt();

        int soldTickets = 0;
        int refusedBuyers = 0;

        while (totalTickets > 0) {
            System.out.print("Skol'ko biletov jelaet pokupat' pokupatel'? ");
            int requestedTickets = scanner.nextInt();

            if (requestedTickets == 0) {
                break;
            }

            if (requestedTickets <= totalTickets) {

                soldTickets += requestedTickets;
                totalTickets -= requestedTickets;
            } else {

                refusedBuyers++;
                System.out.println("Izvinite v nalichii net stol'ko biletov");
            }
        }
        System.out.println("Prodano biletov: " + soldTickets);
        System.out.println("Otkazano kalichestvo biletov " + refusedBuyers + " pokupatelyam.");

        scanner.close();
    }
}
