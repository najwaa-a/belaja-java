package latihanCoding4;

import java.util.Scanner;

public class no1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input jenis kapal: ");
        String jenisKapal = input.nextLine();

        System.out.println("input posisi x kapal: ");
        double x = input.nextDouble();

        System.out.println("input posisi y kalap: ");
        double y = input.nextDouble();

        double jarak = x * x + y * y;

        if (jenisKapal.equals("Tempur") && jarak <= 25.0) {
            System.out.println("tembak");
        } else {
            System.out.println("tidak tembak");
        }
    }
}



