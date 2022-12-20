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
        System.out.println("Стоимость всех покупок " + total + " рублей, размер скидки " + overallDiscount);
    }
    public static void task5 () {
        System.out.println("Дополнительное Задание №1");

    }
    public static void task6 () {
        System.out.println("Дополнительное Задание №6");
        double x = 0.40;
        double y = 0.87;
        double a = 11*x + y;
        double b = (x+10*y)- 15*(x/y);
        System.out.println("11*x + y = " + a +"(x+10*y)- 15*(x/y) = " + b);
// как ограничить количество знаков после запятой?
    }
}