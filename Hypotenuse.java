// Завдання 1. Гіпотенуза
// Дано два числа a та b. Знайдіть гіпотенузу трикутника із заданими катетами.
// Вхідні дані
// У двох рядках вводяться два числа (числа цілі, позитивні, не перевищують 1000).
// Вихідні дані
// Виведіть відповідь на завдання.

import java.util.Scanner;

public class Hypotenuse
{
    public static void main(String[] args) {
        int a = getNum("a", 1000);
        int b = getNum("b", 1000);

        double c = Math.sqrt(a * a + b * b);

        System.out.print("Гіпотенуза трикутника із катетами " + a + " та " + b + " є: ");
        System.out.printf("%.2f", c);
    }

    public static int getNum(String number, int max) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введіть число " + number + ": ");
            try {
                int num = scanner.nextInt();
                if (num > 0 && num <= max) {
                    return num;
                } else {
                    System.out.println("Число повинно бути позитивним та не перевищувати " + max);
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Приймаються лише цілі числа");
                scanner.next();
            }
        }
    }
}
