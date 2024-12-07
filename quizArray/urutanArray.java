import java.util.Scanner;

public class urutanArray {

    public static void inputArray(int[] A, int p) {
        Scanner input = new Scanner(System. in);

        System
            .out
            .println();
        for (int i = 0; i < p; i++) {
            A[i] = input.nextInt();
        }
    }

    public static boolean isDescending(int[] A, int p) {
        for (int i = 0; i < p- 1; i++) {
            if (A[i] < A[i + 1]) 
                return false;
            }
        return true;
    }

    public static boolean isAscending(int[] A, int p) {
        for (int i = 0; i < p - 1; i++) {
            if (A[i] > A[i + 1]) 
                return false;
            }
        return true;
    }

    public static void cekTerurut(int[] A, int p ) {
        if (isDescending(A, p)) {
            System
                .out
                .println("Data pada array terurut secara Descending");
        } else if (isAscending(A, p)) {
            System
                .out
                .println("Data pada array terurut secara Asceding");
        } else {
            System
                .out
                .println("Data pada array tidak urut sama sekali");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System. in);

        System
            .out
            .println();
        int p = input.nextInt();

        int[] A = new int[p];

        inputArray(A, p);

        cekTerurut(A, p);

    }
}
