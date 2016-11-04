/**
 * Написати програму, яка виводить таблицю множення, проте замість чисел,
 * які лежать вище головної діагоналі (1, 4, 9, 16, 25, ..., 81), виводяться решітки.
 * Created by Dmytro Zamosenchuk on 03.11.16.
 */
public class Task8 {
    public static void main(String[] args) {
        int Result;

        System.out.println ("Multiplication table");
        System.out.println (" | 1  2  3  4  5  6  7  8  9");
        System.out.println ("_____________________________");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i +"| ");
            for (int j = 1; j <= 9; j++) {
                Result= (i*j);
                if (j > i ) {
                    System.out.print("#  ");
                }
                else {
                    if ( Result >= 10 ){
                        System.out.print(Result + " ");
                    }
                    else {
                        System.out.print(Result + "  ");
                    }
                   }

            }
            System.out.println(" ");
        }

    }
}
