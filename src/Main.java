import java.time.LocalDate;

import static java.time.Year.isLeap;

public class Main {
    public static void printIsLeapYear(int year) {
        boolean yearIsLeap = isLeap(year);
        printIsLeapYearResult(year, yearIsLeap);
    }

    private static boolean isLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    private static void printIsLeapYearResult(int year, boolean yearIsLeap) {
        if (yearIsLeap) {
            System.out.println(year + "високосный");
        } else {
            System.out.println(year + "не високосный");
        }
    }

    public static void main(String[] args) {
        printIsLeapYear(1948);
        System.out.println("//Задание 2");
    }

    public static void chooseRightApplicationVersion(int clientIOs, int deviceYear) {
        boolean deviceOLd = isDeviceOld (deviceYear);
        System.out.println("Устоновить");
        if (deviceOLd) {
            System.out.println("lite");
        }
        System.out.println("версия для");
        if (clientIOs == 0) {
            System.out.println("iOS");
        }   else {
            System.out.println("Андроид");
        }
    }

    public static void printSetSystem(int clientDeviceYear, int clientDevice) {

        private static boolean isDeviceOld ( int deviceYear){
            int currentYear = LocalDate.now().getYear();
            return deviceYear <= currentYear;
        }
    }
}


