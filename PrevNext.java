//        Напишіть програму, яка зчитує ціле число та виводить текст, аналогічний наведеному у
//        прикладі. Прогалини, розділові знаки, великі і малі літери важливі!
//        Вхідні дані
//        Вводиться ціле число, за модулем, що не перевищує 10000.
//        Вихідні дані
//        Виведіть спочатку фразу "The next number for the number", потім введене число, потім
//        слово "is", оточене пробілами, потім формулу для наступного за введеним числом,
//        нарешті, знак точки без пробілу. Аналогічно у наступному рядку для попереднього числа.

import java.util.Scanner;

public class PrevNext {
    public static void main(String[] args) {
        int num = getNum("", 10000);

        System.out.println("The next number for the number " + num + " is " + (num + 1) + ".");
        System.out.println("The previous number for the number " + num + " is " + (num - 1) + ".");
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
