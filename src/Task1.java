import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Task1 {
//    Для успешного обучения из каждого набора заданий достаточно выполнить 1-2.
//            1.     Приветствовать любого пользователя при вводе его имени через командную строку.
//            2.     Отобразить в окне консоли аргументы командной строки в обратном порядке.
//            3.     Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
//            4.     Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.

public static void main(String[] args) {
    //    1.     Приветствовать любого пользователя при вводе его имени через командную строку.
    hello();
    //    2.     Отобразить в окне консоли аргументы командной строки в обратном порядке.
    revers();



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
}
