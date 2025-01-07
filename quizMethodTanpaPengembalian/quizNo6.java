package quizMethodTanpaPengembalian;

import java.util.Scanner;

public class quizNo6 {
    static void genap(int a) {
        if (a % 2 == 0) {
            System.out.println("Ya");
        } else {
            System.out.println("Tidak");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System. in);
        
        System.out.print("Input bilangan : ");
        int a = input.nextInt();

        genap(a);
    }
}
