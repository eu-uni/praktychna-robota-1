//        N школярів ділять K яблук порівну, залишок, що не ділиться, залишається в кошику.
//        Скільки яблук залишиться у кошику?
//        Вхідні дані
//        Програма отримує вхід числа N і K.
//        Вихідні дані
//        Програма повинна вивести кількість яблук.

import java.util.Scanner;

public class AppleII {
    public static void main(String[] args) {
        int N = getNum("N", 99999);
        int K = getNum("K", 99999);

        int result = K % N;
        System.out.println(result);
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
