package latihanCoding4;

import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Input bilangan 1: ");
        int bil1 = input.nextInt();

        System.out.println("Input bilangan 2: ");
        int bil2 = input.nextInt();

        System.out.println("Input bilangan 3: ");
        int bil3 = input.nextInt();

        System.out.println("Input bilangan 4: ");
        int bil4 = input.nextInt();

        int max = bil1;

        if (bil2 > max) {
            max = bil2;
        }
        if (bil3 > max) {
            max = bil3;
        }
        if (bil4 > max) {
            max = bil4;
        }

        System.out.println("Bilangan terbesar: " + max);

    }
}
