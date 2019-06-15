import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

import static java.lang.Math.random;

public class Task1 {
//    Для успешного обучения из каждого набора заданий достаточно выполнить 1-2.
//            1.     Приветствовать любого пользователя при вводе его имени через командную строку.
//            2.     Отобразить в окне консоли аргументы командной строки в обратном порядке.
//            3.     Вывести заданное количество случайных чисел с переходом и без перехода на новую строку


public static void main(String[] args) {
    //    1.     Приветствовать любого пользователя при вводе его имени через командную строку.
//    hello();
    //    2.     Отобразить в окне консоли аргументы командной строки в обратном порядке.
//    revers();
    //            3.     Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
    someRandomNumbers();
    //            4.     Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.

}

    private static void hello() {
        System.out.println(" Hello! Please enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello! " + name);
    }


    private static void revers() {
        String reversLine = "";
        System.out.print("Введите аргументы : ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int positionNumber = line.length()-1;
        while (positionNumber >= 0) {
            reversLine = reversLine + line.charAt(positionNumber);
            positionNumber--;
        }
        System.out.print("Обратная последовательность аргументов :'" + reversLine + "'");
    }

    private static void someRandomNumbers() {
        System.out.println(" Введите требуемое количество случайных чисел:");
        Scanner scanner = new Scanner(System.in);
        int randomSize = scanner.nextInt();
        int[] randomNumber = new int[randomSize];
        System.out.println(" Случайных чисел от 0 до 100 :" + randomSize );
        System.out.println(" Вывод c переходом на новую строку:");
        for (int i = 0; i <randomSize; i++) {
            randomNumber[i] = (int) (Math.random() * 100);
            System.out.println(randomNumber[i]);
        }
        System.out.println("Вывод без перехода на новую строку:");
        for (int i = 0; i <randomSize; i++) {
            System.out.print(randomNumber[i] + " ");
        }
    }
}
