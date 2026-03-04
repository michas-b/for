
public class Main {
    public static void main(String[] args) {
        // Задачача 1
        for (int a = 1; a <= 10; a++) {
            System.out.println(a);
        }

        // Задачача 2
        for (int b = 10; b >= 1; b--) {
            System.out.println(b);
        }

        // Задачача 3
        for (int c = 0; c <= 17; c += 2) {
            System.out.println(c);
        }

        // Задачача 4
        for (int d = 10; d >= -10; d--) {
            System.out.println(d);
        }

        // Задачача 5
        for (int e = 1904; e <= 2096; e += 4) {
            System.out.println(e + " год является високосным");
        }

        // Задачача 6
        for (int f = 7; f <= 98; f += 7) {
            System.out.println(f);
        }

        // Задачача 7
        for (int g = 1; g <= 512; g *= 2) {
            System.out.println(g);
        }

        // Задачача 8
        int money = 29000;
        for (int h = 1; h <= 12; h++) {
            System.out.println("Месяц " + h + ", сумма накоплений равна " + (money * h) + " рублей");
        }

        // Задачача 9
        money = 29000;
        int totaleMoney = 0;
        for (int i = 1; i <= 12; i++) {
            totaleMoney += (money * i);
            totaleMoney += (totaleMoney / 100);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totaleMoney + " рублей");
        }

        // Задачача 10
        for (int j = 1; j <= 10; j++) {
            System.out.println("2*" + j + "=" + (2 * j));
        }
    }
}