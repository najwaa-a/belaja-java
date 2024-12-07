import java.util.Scanner;

public class bilanganASCII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        byte[] ascciArray = new byte[100];
        int total = 0;
        int p;
        
        System.out.println("Input kode ASCII (Ketik 0 untuk berhenti): ");

        while (true) {
            p = input.nextInt();
            if (p == 0) {
                break;
            }

            if (p >= 0 && p <= 127 ) {
                ascciArray[total] = (byte) p;
                total++;
            }
            else {
                System.out.println("input ASCII yang valid (0-127): ");
            }
        }

        System.out.println("Hasil dalam bentuk Huruf: ");
        for (int i = 0; i < total; i++) {
            System.out.printf("%c", ascciArray[i]);
        }
        System.out.println();
    }
}
