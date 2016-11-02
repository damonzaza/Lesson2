/**
 * Написати програму, яка буде виводити числа, починаючи від 10, закінчуючи 0 з інтервалом в -1,
 * числа виводити через  знак коми : ",". Якщо буде зайва кома після останнього числа - нічого
 * страшного.
 * Created by Dmytro Zamosenchuk on 01.11.16.
 */

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Numbers from 10 to zero")
        for (int i = 10; i >= 0; i--) {
            System.out.print (" " + i);
            if (i > 0) {
                System.out.println (",");
            }
        }
    }
}
