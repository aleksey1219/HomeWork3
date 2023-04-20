public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void task1() {
        System.out.println("Решение задачи 1");
        int box = 45;
        byte cat = -12;
        short dog = 35;
        long man = 123412512;
        float Box = 1.3423f;
        double apple = 2.42;
        System.out.println("Значение переменной box с типом int равно " + box);
        System.out.println("Значение переменной cat с типом byte равно " + cat);
        System.out.println("Значение переменной dog с типом short равно " + dog);
        System.out.println("Значение переменной man с типом long равно " + man);
        System.out.println("Значение переменной Box с типом float равно " + Box);
        System.out.println("Значение переменной apple с типом double равно " + apple);
    }

    public static void task2() {
        System.out.println("Решение задачи 2");
        int a = 27897;
        byte b = 67;
        short c = -159;
        var n = 569;
        long y = 987678965549l;
        float q = 2.786f;
        double z = 27.12;
    }

    public static void task3() {
        System.out.println("Решение задачи 3");
        int L = 23;
        int A = 27;
        int E = 30;
        int papper = 480;
        int cheldren = L + A + E;
        int list = papper / cheldren;
        System.out.println("На каждого ученика рассчитано " + list + " листов бумаги");
    }

    public static void task4() {
        System.out.println("Решение задачи 4");
        int min20 = (20 / 2) * 16;
        System.out.println("За 20 минут машина произвела " + min20 + " штук бутылок");
        int day = (1440 / 2) * 16;
        System.out.println("За 1 день машина произвела " + day + " штук бутылок");
        int day3 = day * 3;
        System.out.println("За 3 день машина произвела " + day3 + " штук бутылок");
        int month = day3 * 10;
        System.out.println("За 1 месяц машина произвела " + month + " штук бутылок");
    }

    public static void task5() {
        System.out.println("Решение задачи 5");
        int banok = 120;
        int classW = 2;
        int classB = 4;
        int ClassOll = banok / (classB + classW);
        int white = ClassOll * classW;
        int black = ClassOll * classB;
        System.out.println("В школе, где " + ClassOll + " классов,нужно " + white + " банок белой краски и " + black + " банок черной краски ");
    }

    public static void task6() {
        System.out.println("Решение задачи 6");
        int banana = 5 * 80;
        int milk = 2 * 105;
        int plombir = 2 * 100;
        int egg = 4 * 70;
        int massGr = banana + milk + plombir + egg;
        int kg = 1000;
        int massKg = massGr / kg;
        System.out.println("Масса спортзавтрака в киллограмах " + massKg + " кг.");


    }
}