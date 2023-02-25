public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println(" Задача 1 ");
        for (int t = 1; t <= 10; t++) {
            System.out.println("Вывод чисел " + t);
        }
    }

    public static void task2() {
        System.out.println(" Задача 2 ");
        for (int t = 10; t >= 1; t--) {
            System.out.println("Вывод чисел " + t);
        }
    }

    public static void task3() {
        System.out.println(" Задача 3 ");
        for (int h = 0; h <= 17; h += 2) {
            System.out.println(" Вывод четных чисел " + h);
        }
    }

    public static void task4() {
        System.out.println(" Задача 4 ");
        for (int t = 10; t >= -10; t--) {
            System.out.println("Вывод чисел " + t);
        }
    }
    public static void task5() {
        System.out.println(" Задача 5 ");
        for (int i = 1904; i <=2096; i += 4) {
            System.out.println(" Високосные года " + i);
        }
    }
    public static void task6() {
        System.out.println(" Задача 6 ");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(" Последовательность чисел " + i);
        }
    }
    public static void task7() {
        System.out.println(" Задача 6 ");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(" Последовательность чисел " + i);
        }
    }
}