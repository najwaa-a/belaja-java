package quizMethodTanpaPengembalian;

import java.util.Scanner;

public class quizNo1 {
    static void sortAscending(int a, int b, int c) {

        if (a >= b) {
            if (b >= c) {
                System.out.println(c + " " + b + " " + a);
            }
            if (c >= a) {
                System.out.println(b + " " + a + " " + c);
            }
            if (a > c) {
                System.out.println(b + " " + c + " " + a);
            }
        }

        if (c >= a) {
            if (c >= b) {
                System.out.println(a + " " + b + " " + c);
            }
            if (c >= a) {
                System.out.println(b + " " + a + " " + c);
            }
            if (a > c) {
                System.out.println(b + " " + c + " " + a);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System. in);
       
        System.out.println("Input nilai a :");
        int a = input.nextInt();
       
        System.out.println("Input nilai b :");
        int b = input.nextInt();
       
        System.out.println("Input nilai c :");
        int c = input.nextInt();
       
        sortAscending(a, b, c);
    }
}
