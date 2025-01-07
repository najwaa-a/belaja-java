package quizMethodTanpaPengembalian;

import java.util.Scanner;

public class quizNo7 {
    static void urutanAngka (int num1, int num2, int num3) {
        if (num1 >= num2) {
            if (num2 >= num3) {
                System.out.println(num3 + " " + num2 + " " + num1);
            }
            if (num3 >= num1) {
                System.out.println(num2 + " " + num1 + " " + num3);
            }
            if (num1 > num3) {
                System.out.println(num2 + " " + num3 + " " + num1);
            }
        }

        if (num3 >= num1) {
            if (num3 >= num2) {
                System.out.println(num1 + " " + num2 + " " + num3);
            }
            if (num3 >= num1) {
                System.out.println(num2 + " " + num1 + " " + num3);
            }
            if (num1 > num3) {
                System.out.println(num2 + " " + num3 + " " + num1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input num 1 : ");
        int num1 = input.nextInt();
        
        System.out.print("Input num 2 : ");
        int num2 = input.nextInt();
        
        System.out.print("Input num 3 : ");
        int num3 = input.nextInt();

        urutanAngka(num1, num2, num3);

    }
}
