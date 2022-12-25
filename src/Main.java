public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void task1 () {
        System.out.println("Дополнительное Задание №1");
      int a = 47;
      int b = 13;
      int div = a/b;
      int wholeRest = a%b;
        System.out.println("47/13 равно " + div + " и " + wholeRest + " в остатке.\n");

    }
    public static void task2 () {
        System.out.println("Дополнительное Задание №2");
        int a = 56;
        int b = a%10;
        int c = a/10;
        System.out.println(c);
        System.out.println("Сумма цифр числа " + a + " равна " + (b + c));
        // почему 56/10 = 5?
        // потому что формат integer rounds down the resulting number
    }
    public static void task3 () {
        System.out.println("Дополнительное Задание №3");
        int a = 999;
        int c = a/100;
        int d = a%100;
        int e = d%10;
        int b = d/10;
        System.out.println("Сумма цифр числа " + a + " равна " + (b + c + e) + "\n");
    }
    public static void task4 () {
        System.out.println("Дополнительное Задание №4");
        var bouquet = 4999;
        var card = 157;
        var discount = 0.1;
        var total = bouquet + card - (bouquet + card)*discount;
        var overallDiscount = (bouquet + card)*discount;
        System.out.println("Стоимость всех покупок " + total + " рублей, размер скидки " + overallDiscount + "\n");
    }
    public static void task5 () {
        System.out.println("Дополнительное Задание №5");
        var oranges = 73;
        var discOranges = 0.15;
        var kgOranges = 10;
        var bananas = 95;
        var kgBananas = 2;
        var total = oranges*kgOranges*discOranges + bananas*kgBananas;
        System.out.println("Куплено " + kgOranges+ " кг апельсинов и " + kgBananas + " кг бананов");
        System.out.println("Сумма покупки " + total + "\n");

        var champagne = 2870;
        var bread = 27;
        var discChampagne = 0.5;
        var bottles = 7;
        var loafs = 1;
        var total1 = champagne*bottles*discChampagne + bread*loafs;
        System.out.println("Куплено " + bottles+ " бутылок шампансокго и " + loafs + " буханка хлеба");
        System.out.println("Сумма покупки " + total1 + "\n");

        var champsPrice = 436;
        var whiteMushroomsPrice = 578;
        var discWhiteMushrooms = 0.05;
        var kgchamps = 2.5;
        var kgWhiteMushrooms = 3.75;
        var total2 = champsPrice*kgchamps + whiteMushroomsPrice*kgWhiteMushrooms*discWhiteMushrooms;
        System.out.println("Куплено " + kgchamps+ " кг шампиньонов и " + kgWhiteMushrooms + " кг белых грибов");
        System.out.println("Сумма покупки " + total2 + "\n");


    }
    public static void task6 () {
        System.out.println("Дополнительное Задание №6");
        double x = 0.40;
        double y = 0.87;
        double a = 11*x + y;
        double b = (x+10*y) - 15*(x/y);
        System.out.printf("11*x + y = %.3f" + a + "  (x+10*y)- 15*(x/y) = " + b);
// как ограничить количество знаков после запятой?
    }
}