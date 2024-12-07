
import java.util.Scanner;

public class HitungJumlahBilangan {
    private static int angka; 

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // jangan lupa scanner inputnya

        int total = 0; // bilangannya akan dimulai dari 0 
        System.out.println("Input Bilangan:"); // kemudian yang pertama kali muncul adalah kita disuruh menginputkan sebuah nilai 
        angka = input.nextInt(); // jangan lupa ketik ini untuk kita bisa menginputkan sebuah bilangan atau angka

        while (angka >= 0) { // dengan kondisi angka yang akan dimasukan berjumlah lebih dari 0. dan ketika kurang dari 0 kondisi akan langsung berakhir
            total += angka; // maksudnya adalah total dari angka yang akan dimasukkan akan dijumlahkan
            System.out.println("Input angka lagi:"); // akan berulang seperti ini sampai user menginputkan bilangan < 0 atau negatif
            angka = input.nextInt(); // untuk memasukkan sebuah angka atau variable
        }

        System.out.println("total jumlah angka yang dimasukan:" + total); // digunakan untuk print total dari jumlah angka / bilangan (positif) dan akan print jumlah totalnya

        // kondisi ini akan berakhir ketika user menginputkan angka atau bilangan yangn bernilai negatif atau < 0
    }
}
