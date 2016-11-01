/**
 * http://denveradapt.org/upload/CCDC/bart-simpson-chuck.. ,
 * створити програму, яка виводитиме такий напис задану кількість разів.
 * Created by Dmytro Zamosenchuk on 01.11.16.
 */
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        int a=0;
       // String Phrase;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Input positive integer: ");
            a = in.nextInt();
            if (a < 0) {
                System.out.println("Integer is negative!");
            }
        }
        while (a < 0);
        Scanner in2 = new Scanner(System.in);
        System.out.print("Input phrase: ");
        String Phrase = in2.nextLine();
        System.out.println("Result:");
        for (int i = 0; i < a ; i++) {
            System.out.println(Phrase);
        }
    }
}
