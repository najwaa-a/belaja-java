import java.util.Scanner;

public class Student {
    static void hitungRata( String nama,int matkul, int bahasa, int inggris, int matematika) {
        int rata = (bahasa + inggris + matematika) / 3;
        System.out.println("Nama :" + nama );
        System.out.println("No Matkul :" + matkul );
        System.out.println("Nilai Bahasa :" + bahasa );
        System.out.println("Nilai Inggris :" + inggris );
        System.out.println("Nilai Matematika :" + matematika );
        System.out.println("Rata - rata :" + rata);

    }

    //NAJWA AREEFA GHAISANI_103122400028//

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input nama :");
    String nama = input.nextLine();
    
    System.out.print("Input no matkul :");
    int matkul = input.nextInt();

    System.out.print("Input nilai bahasa :");
    int bahasa = input.nextInt();

    System.out.print("Input nilai inggris :");
    int inggris = input.nextInt();

    System.out.print("input nilai matematika :");
    int matematika = input.nextInt();

    hitungRata(nama, matkul, bahasa, inggris, matematika);
}
}
