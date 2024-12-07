
import java.util.Scanner;

public class TebakAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angkaRahasia = 15; //deklarasikan dulu angka rahasianya berapa
        int tebak = 0; // bilangan akan dimulai dari angka 0 

        System.out.println("Tebak angka antara 1 sampai 20"); 
        System.out.println("<------------------------------------>");

        while (tebak != angkaRahasia) { // saat nilai yang di inputkan tidak sama dengan angka rahasia
            System.out.print("Input tebakan anda:"); // untuk menginputkan nilai / tebakan kita
            tebak = input.nextInt();
            
            if (tebak < angkaRahasia) { // jika angka yang di inputkan kurang dari angka rahasia yang sudah ditetapkan 
                System.out.println("Terlalu rendah, coba lagii!!"); // maka akan muncul kalimat 'terlalu rendah, coba lagi'
            } else if (tebak > angkaRahasia) { // jika angka yang diinputkan lebih dari angka rahasia yang sudah ditetapkan 
                System.out.println("Terlalu tinggi, coba tebak lagiiii hayoooo"); // maka akan muncul kalimat 'terlalu tinggi, coba lagi hayooo'
            }
        }

        System.out.println("Selamat!!!! anda berhasil menebak angka rahasia"); // jika angka yang diinputkan sudah sama dengan angka rahasia maka akan muncul kalimat 'selamat, blablablabla'
    }
}
