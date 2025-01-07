package quizMethodTanpaPengembalian;

import java.util.Scanner;

public class quizNo4 {
    static void hitungHari(int tahun){
        if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
            System.out.println("Jumlah Hari dalam tahun " + tahun + " adalah 366 hari");
        } else {
            System.out.println("Jumlah hari dalam tahun " + tahun + " adalah 365 hari ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input tahun: ");
        int tahun = input.nextInt();

        hitungHari(tahun);
    }
}
