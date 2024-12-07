import java.util.Scanner;

public class Umurrr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input Umur :"); // jangan lupa kalau letaknya diatas deklarasi kamus
        int umur = input.nextInt(); // jangan lupa kalau mau input harus pakai input.nextblabla()
        

        if (umur < 12) { 
            System.out.println("Kategori anak - anak");
        } else if (umur >= 12 && umur <= 17) { // jangan lupa itu umur nya ditulis lagi setelah && baru <= 17
            System.out.println("Kategori remaja");
        } else if (umur > 18 && umur <= 59) {
            System.out.println("Kategori Dewasa");
        } else if (umur >= 60) {
            System.out.println("Lansia");
        } else {
            System.out.println("Tidak terdaftar");
        }
    }
}
