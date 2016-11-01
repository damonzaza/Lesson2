/**
 * Написати програму, в якій створюється змінна типу int, і записати в неї якесь невід'ємне число,
 * потім за допомогою оператора if else, а також арифметичної дії "%" - залишок від ділення перевірити,
 * чи є введене число парним, якщо воно парне вивести на екран even, інакше - odd.
 * Created by Dmytro Zamosenchuk on 01.11.16.
 */
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        int a=0;
        int Result;

        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Input positive integer: ");
            a = in.nextInt();
            if (a < 0) {
                System.out.println("Integer is negative!");
            }
        }
        while (a < 0);
        Result=a%2;
        if (Result == 0) {
            System.out.print("Integer is odd.");
        }
        else {
            System.out.print("Integer is even.");
        }
    }
}
