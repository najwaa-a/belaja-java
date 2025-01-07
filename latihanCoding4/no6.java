package latihanCoding4;

import java.util.Scanner;

public class no6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input jumlah prajurit Turki: ");
        int prajuritTurki = input.nextInt();

        System.out.print("Input jumlah prajurit Mongol: ");
        int prajuritMongol = input.nextInt();

        int totalturki = prajuritTurki * 3;
        int totalMongol = prajuritMongol;

        if (totalturki > totalMongol) { // Jika total prajurit Turki lebih besar dari total prajurit Mongol
            System.out.println("Turki menang!");
        } else if (totalturki < totalMongol) { // tambahkan else if
            System.out.println("Mongol menang!");
        } else { // tambahkan else
            System.out.println("imbang");
        }

    }
}
