/**
 * Написати програму, застосовуючи циклічний опетор for(не застосовуючи умовний оператор),
 * яка буде виводити на консоль лише парні числа, починаючи від 0 закічнуючи 20 включно
 * Created by Dmytro Zamosenchuk on 03.11.16.
 */
public class Task4 {
    public static void main(String[] args) {
        System.out.println("Numbers from 0 to 20. Only even");
        for (int i = 0; i <= 20; i += 2) {
            System.out.print (" " + i);
            if (i != 20) {
                System.out.print (",");
            }
        }
    }
}
