import java.util.Scanner;

public class hitungArray {

    public static void main(String[] args) {
        totalBilangan();
    }

    public static void totalBilangan() {
        Scanner input = new Scanner(System. in);
        int[] bilangan = new int[100];
        int total = 0;
        int i = 0;

        System
            .out
            .println("Input bilangan bulat (akhiri dengan 0) : ");

        while (true) {
            int angka = input.nextInt();
            if (angka == 0) {
                break;
            }
            bilangan[i] = angka;
            total += angka;
            i++;
        }

        System
            .out
            .println("total angka yang dimasukkan:" + total);

    }

}
