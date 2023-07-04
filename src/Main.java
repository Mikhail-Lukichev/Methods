import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Task 1");
        int year = 2023;
        if (checkIsLeapYear(year)) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " is regular year");
        }
    }
    public static boolean checkIsLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void task2() {
        System.out.println("Task 2");
        int clientOS = 0;
        int clientDeviceYear = 2023;
        suggestOSversion(clientOS,clientDeviceYear);
    }
    public static void suggestOSversion(int clientOS,int clientDeviceYear) {
        int iOs = 0;
        int android = 1;
        int currentYear = LocalDate.now().getYear();

        if (clientOS == iOs) {
            if ( clientDeviceYear < currentYear) {
                System.out.println("Install light iOS");
            } else {
                System.out.println("Install iOS");
            }
        } else if (clientOS == android) {
            if ( clientDeviceYear < currentYear) {
                System.out.println("Install light Android");
            } else {
                System.out.println("Install Android");
            }
        } else {
            System.out.println("Unknown operating system");
        }
    }
    public static void task3() {
        System.out.println("Task 3");
        int deliveryDistance = 10;

        int deliveryTime = checkDeliveryTime(deliveryDistance);

        if (deliveryTime != 999) {
            System.out.println("Delivery time is " + deliveryTime + " day(s)");
        } else {
            System.out.println("Delivery is not possible");
        }
    }
    public static int checkDeliveryTime(int deliveryDistance) {
        int deliveryTime = 0;

        if (deliveryDistance < 20) {
            deliveryTime = 1;
        } else if ( deliveryDistance >=20 && deliveryDistance < 60) {
            deliveryTime = 2;
        } else if ( deliveryDistance >=60 && deliveryDistance < 100 ) {
            deliveryTime = 3;
        } else {
            deliveryTime = 999;
        }
        return deliveryTime;
    }
}