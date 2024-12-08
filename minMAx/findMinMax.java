public class findMinMax {
    public static void main(String[] args) {

        //NAJWA AREEFA GHAISANI_3122400028//

        int[] angka = {12, 3, 5, 7, 19, 1, 25, 17};
        int min = angka[0];
        int max = angka[0];

        for (int i = 1; i < angka.length; i++) {
            if (angka[i] < min) {
                min = angka[i];
            }
            if (angka[i] > max) {
                max = angka[i];
            }
        }

        System.out.println("Nilai Minimum: " + min);
        System.out.println("Nilai Maximum: " + max);
    }
}
