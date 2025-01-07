package latihanCoding4;

import java.util.Scanner;

public class no4 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Input bilangan pertama : ");
        int bil1 = input.nextInt();

        System.out.println("input bilangan kedua : ");
        int bil2 = input.nextInt();

        int min = bil1;

        if (bil2 < min) {  // jika bil2 lebih kecil dari min
            min = bil2;   // maka ubah min menjadi bil2
        } else {  // jika bil2 tidak lebih kecil dari min
            min = bil1;  // maka ubah min menjadi bil1
        }

        System.out.println("bilangan terkecil adalah: " + min);
    }
}
