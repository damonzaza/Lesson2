/**
 * Написати програму, яка виведе на екран всі числа, які діляться націло на m від 1 до числа n,
 * де числа n та m задаються користувачем. Наприклад n = 15, m = 3, тоді відповідь: 3, 6, 9, 12, 15
 * Created by Dmytro Zamosenchuk on 03.11.16.
 */
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int m = 0;
        int n = 0;
        // double Result=0;
        System.out.println("This program show all integer numbers from range 1 to N and divided by M");
        Scanner in = new Scanner(System.in);
        System.out.print("Input range (integer) ");
        n = in.nextInt();
        System.out.print("Input integer M ");
        m = in.nextInt();
        System.out.print("Result: ");
        for (int i = m; i <= n; i += m) {
        System.out.print(i + " ");

        }
    }
}
