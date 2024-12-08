import java.util.Scanner;

public class testMaxMin {

    //NAJWA AREEFA GHAISANI_103122400028//

    public static void main(String[] args) {
        Scanner input = new Scanner(System. in);

        int[] data = new int[8];

        for (int i = 0; i < 8; i++) {
            data[i] = input.nextInt();
        }

        System.out.println();

        int min = data[0];
        int max = data[0];

        for (int i = 1; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
            if (data[i] > max) {
                max = data[i];
            }
        }

        System.out.print("Data Array: ");
        for (int i = 0; i < 8; i++) {
            System
                .out
                .print(data[i]);
            if (i < 8 - 1) {
                System
                    .out
                    .print(", ");
            }
        }
        System.out.println();
        System.out.println("Nilai Maximum: " + max);
        System.out.println("Nilai Minimum: " + min);

    }
}
