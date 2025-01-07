package quizMethodTanpaPengembalian;

import java.util.Scanner;

public class quizNo2 {

    static void audisi(String j1, String j2, String j3) {
        int hitungYes = 0;

        if (j1.equals("yes")) { //inget2 nieee equalss buat membandingkan stringgggg, soalny tdi nyoba pkek == kagak bisa, hikd
            hitungYes++;
        }
        if (j2.equals("yes")) {
            hitungYes++;
        }
        if (j3.equals("yes")) {
            hitungYes++;
        }

        if (hitungYes >= 2) {
            System.out.println("lolos");
        } else {
            System.out.println("tidak lolos");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System. in);
        String[] vote = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Input suara juri : " + (i + 1) + " (yes / no): ");
            vote[i] = input.nextLine().toLowerCase();
        }

        audisi(vote[0], vote[1], vote[2]);
    }
}
