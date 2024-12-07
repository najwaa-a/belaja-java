import java.util.Scanner;

public class SesiLatihan {

    //NAJWA AREEFA GHAISANI_103122400028//

    public static void main(String[] args) {
        Scanner input = new Scanner(System. in);

        System
            .out
            .print("Input pemain yang ditinjau: ");
        int p = input.nextInt();
        input.nextLine();

        String[] nama = new String[p];
        String[] total = new String[p];

        for (int i = 0; i < p; i++) {
            System
                .out
                .print("Input nama pemain ke- " + (
                    i + 1
                ) + ": ");
            nama[i] = input.nextLine();

            int jumlah = 0;
            for (int j = 1; j <= 3; j++) {
                System
                    .out
                    .print("Input point set  " + j + " " + nama[i] + ": ");
                jumlah += input.nextInt();

            }

            input.nextLine();

            double ratarata = jumlah / 3.0;

            if (ratarata < 40) {
                total[i] = nama[i] + " harus mengikuti latihan ekstra selama 1 minggu";
            } else if (ratarata < 50) {
                total[i] = nama[i] + " harus mengikuti latihan ekstra selama 3 hari";
            } else {
                total[i] = nama[i] + " tidak perlu mengikuti latihan tambahan";
            }

        }
        
        for (String penilaian : total) {
            System
                .out
                .println(penilaian);
        }

    }
}
