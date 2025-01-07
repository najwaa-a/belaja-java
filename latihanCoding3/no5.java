package latihanCoding3;

import java.util.Scanner;

public class no5 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input jumlah kembalian : ");
        int kembalian = input.nextInt();

        int sepuluhRibu = kembalian / 10000;  // 10000 = 10.000
        kembalian %= 10000;  //  sisakan kembalian setelah membagi 10.000

        int limaRibu = kembalian / 5000;  // 5000 = 5.000
        kembalian %= 5000;  //  sisakan kembalian setelah membagi 5.000

        int seribu = kembalian / 1000;  // 1000 = 1.000

        System.out.println("Uang sepuluh ribuan : " + sepuluhRibu + " lembar");
        System.out.println("Uang lima ribuan : " + limaRibu + " lembar");
        System.out.println("Uang seribuan : " + seribu + " lembar");

    }
}
