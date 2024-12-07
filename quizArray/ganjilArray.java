import java.util.Scanner;

public class ganjilArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System. in);

        int p = input.nextInt();

        while (p <= 0) {
            System
                .out
                .println("input angka lebih dari 0: ");
            p = input.nextInt();
        }

        int[] angka = new int[p];

        for (int i = 0; i < p; i++) {
            System
                .out
                .println("input bilangan positif ke-" + (
                    i + 1
                ) + ": ");
            int masukkan = input.nextInt();

            while (masukkan < 0) {
                System
                    .out
                    .println("input angka lebih dari 0: ");
                masukkan = input.nextInt();
            }
            angka[i] = masukkan;
        }

        int maxGanjil = Integer.MIN_VALUE;
        boolean terdapatGanjil = false;

        System
            .out
            .print("Input bilangan ganjil: ");
        for (int i = 0; i < p; i++) {
            if (angka[i] % 2 != 0) {
                System
                    .out
                    .print(angka[i] + " ");
                terdapatGanjil = true;
                if (angka[i] > maxGanjil) {
                    maxGanjil = angka[i];
                }
            }
        }

        if (!terdapatGanjil) {
            System
                .out
                .println("- 0");
        } else {
            System
                .out
                .println("Bilangan ganjil terbesar: " + maxGanjil);
        }
    }

}
