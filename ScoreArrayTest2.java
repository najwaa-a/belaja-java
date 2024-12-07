public class ScoreArrayTest2 {
    public static void main(String[] args) {

        // NAJWA AREEFA GHAISANI_103122400028

        int[] nilai = {
            93,
            87,
            90
        };
        int total = 0;

        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];

        }

        double ratarata = (double)total / nilai.length;

        System
            .out
            .println("Bahasa korea: " + nilai[0]);
        System
            .out
            .println("Bahasa Inggris: " + nilai[1]);
        System
            .out
            .println("Matemtika: " + nilai[2]);
        System
            .out
            .println("Rata - Rata: " + ratarata);
    }
}
