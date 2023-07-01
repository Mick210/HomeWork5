import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1() {
        System.out.println("Задача 1");
        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        byte clientOS = 0;
        short oldVersion = 2014;
        switch (clientOS) {
            case 0:
                if (oldVersion > 2015) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                if (oldVersion > 2015) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
                break;
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        short year = 1080;
        boolean leapYear = year % 400==0;
        if (year%400==0 || year%4==0 && year%100!=0) {
            System.out.println("Год является високосным");
        } else System.out.println("Год не является високосным");
    }
    public static void task4() {
        System.out.println("Задача 4");
        short deliveryDistance = 95;
        if (deliveryDistance<20) {
            System.out.println("Потребуется 1 день");
        } else if (deliveryDistance>=20 && deliveryDistance<60) {
            System.out.println("Потребуется 2 дня");
        } else if (deliveryDistance>=60 && deliveryDistance<=100) {
            System.out.println("Потребуется 3 дня");
        } else System.out.println("Доставки нет");
    }
    public static void task5() {
        System.out.println("Задача 5");
        byte monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону осень");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }

    }
}


