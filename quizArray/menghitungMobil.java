import java.util.Scanner;

public class menghitungMobil {

    // NAJWA AREEFA GHAISANI_103122400028//

    public static void main(String[] args) {
        Scanner input = new Scanner(System. in);

        String[] mobil = {
            "merah",
            "abu",
            "hitam"
        };
        int[] total = new int[3];

        while (true) {
            String masuk = input.nextLine();

            if (masuk.equals("-1")) {
                break;
            }

            boolean benar = false;
            for (int i = 0; i < mobil.length; i++) {
                if (masuk.equals(mobil[i])) {
                    total[i]++;
                    benar = true;
                    break;
                }
            }
        }

        int jumlahTerbanyak = 0;
        for (int i = 1; i < total.length; i++) {
            if (total[i] > total[jumlahTerbanyak]) {
                jumlahTerbanyak = i;
            }
        }

        System
            .out
            .println("Mobil terbanyak: " + mobil[jumlahTerbanyak]);
    }
}
