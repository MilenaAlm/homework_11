import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int year = 2020;
        printInfoAboutYear(year);
        printAboutVersion(1, 2022);
        int deliveryDistance = 35;
        int days = calculateDaliveryDays(deliveryDistance);
        if (days == -1){
            System.out.println("Доставка невозможна на расстоянии " +deliveryDistance+ " км.");
        }else {
            System.out.println("Потребуется дней: " + days);
        }
    }

    public static int calculateDaliveryDays(int deliveryDistance) {
        if (deliveryDistance>= 0 && deliveryDistance<20){
            return 1;
        }else if (deliveryDistance>20 && deliveryDistance<60){
            return 2;
        }else if (deliveryDistance>60 && deliveryDistance<100){
            return 3;
        }else{
            return -1;

        }
    }

    public static void printAboutVersion(int os, int productionYear) {
        if (os < 0 || os > 1) {
            System.out.println("ОС должно быть равно 0 или 1");
            return;
        }
        int currentYear = LocalDate.now().getYear();
        if (productionYear > currentYear) {
            System.out.print("Установите облегченную версию ");
        } else
            System.out.print("Установите обычную версию ");
        if (os == 0) {
            System.out.println("для IOS");
        } else
            System.out.println("для Android");
    }


    public static void printInfoAboutYear(int year) {
        if (isLeapYear(year)) {
            System.out.println(year + " год является высокосным");
        } else {
            System.out.println(year + " год не является высокосным");
        }
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

    }
}