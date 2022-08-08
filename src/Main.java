public class Main {
    public static void main(String[] args) {

             //Задача 1

        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");

        } else {
            System.out.println("Установите версию приложения для Android  по ссылке.");
        }
            //Задача 2
        int clientOS1 = 0;
        int clientDeviceYear = 2011;
        if (clientOS1 == 1 && clientDeviceYear <= 2014) {
            System.out.println("Установите облегченную версию для Андроид по ссылке");
        } else if (clientOS1 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию для Андроид по ссылке");
        } else if (clientOS1 == 0 && clientDeviceYear <= 2014) {
            System.out.println("Установите облегченную версию для iOS по ссылке");
        } else {
            System.out.println("Установите версию для iOS");
        }
        // Задача 3
        int year=2022;
        if (year % 4==0 && year%100!=0 || year%400==0){
            System.out.println(year+" год является высокосным");
        } else{
            System.out.println(year+"год не является высокосным");
        }
                 //Задача 4
        int deliveryDistanse=95;
        int deliveryDays=1;
        int interval=40;
        int startInterval=20;
        if ( deliveryDistanse<=startInterval){
            deliveryDays=1;
        } else{
            deliveryDays=deliveryDays+ (int) Math.ceil((deliveryDistanse-startInterval)/interval)+1;
        }
        System.out.println("Потребуется дней: "+deliveryDays);


        // Задача 5
        int monthNumber=4;
        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет");
    }

    }

}