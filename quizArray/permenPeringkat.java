import java.util.Scanner;

public class permenPeringkat {

    //NAJWA AREEFA GHAISANI_103122400028//

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int murid = input.nextInt();
        int[] peringkat = new int[murid];
        int[] banyakPermen = new int[murid];

        for (int i = 0; i < murid; i++) {
            peringkat[i] = input.nextInt();
        }

        for (int i = 0; i < murid; i++) {
            banyakPermen[i] = 1;
        }

        for (int i = 1; i < murid; i++) {
            if (peringkat[i] > peringkat[i - 1]) {
                banyakPermen[i] = banyakPermen[i - 1] + 1;

            }

        }

        for (int i = murid - 2; i >= 0; i--) {
            if (peringkat[i] > peringkat[i + 1]) {
                banyakPermen[i] = Math.max(banyakPermen[i], banyakPermen[i + 1] + 1);
            }
        }

        int jumlahPermen = 0;
        for (int permen : banyakPermen) {
            jumlahPermen += permen;
        }

        for (int permen : banyakPermen) {
            System
                .out
                .print(permen + "  ");
        }

        System
            .out
            .println();
        System
            .out
            .println(jumlahPermen);

    }
}
