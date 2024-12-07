import java.util.Scanner;

public class rataRataJualArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System. in);

        int[] terjual = new int[100];
        double[] pemasukan = new double[100];
        int total = 0;

        while (true) {
            System
                .out
                .println("Jumlah barang yang terjual (0 untuk berhenti) : ");
            int jual = input.nextInt();

            System
                .out
                .println("Input pemasukan (0 untuk berhenti) : ");
            double pemasukanBaru = input.nextDouble();

            if (jual == 0 && pemasukanBaru == 0) {
                break;
            }

            terjual[total] = jual;
            pemasukan[total] = pemasukanBaru;
            total++;
        }

        double rataRataBarang = totalRataRataBarang(terjual, total);
        double rataRataPemasukan = totalRataRataPemasukan(pemasukan, total);

        System
            .out
            .println("Rata-rata barang terjual: " + String.format("%.2f", rataRataBarang));
        System
            .out
            .println("Rata-rata pemasukan: " + String.format("%.2f", rataRataPemasukan));
    }

    public static double totalRataRataBarang(int[] terjual, int total) {
        int hasil = 0;
        for (int i = 0; i < total; i++) {
            hasil += terjual[i];
        }
        return (total > 0)
            ? (double)hasil / total
            : 0;
    }

    public static double totalRataRataPemasukan(double[] pemasukan, int total) {
        double hasil = 0;
        for (int i = 0; i < total; i++) {
            hasil += pemasukan[i];
        }
        return (total > 0)
            ? hasil / total
            : 0;
    }
}
