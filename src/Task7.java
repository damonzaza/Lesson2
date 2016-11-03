/**
 * Написати програму, яка знайде рахувати суму арефметичного ряду починаючи від 1, закінчуюючи n,
 * де число n - задається користувачем, наприклад, якщо n = 5, то відповідь 1+2+3+4+5 = 15.
 * Created by Dmytro Zamosenchuk on 03.11.16.
 */
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        int n = 0;
        double Result = 0;
        System.out.println("This program cunt sum of range numbers");
        Scanner in = new Scanner(System.in);
        System.out.print("Input range (integer) ");
        n = in.nextInt();
        System.out.print("Sum is ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + "+");
            Result += i;
        }
        System.out.print("="+ Result);
    }
}
