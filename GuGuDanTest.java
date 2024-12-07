
import java.util.Scanner;

public class GuGuDanTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 2;
        int k;

        while (i <= 10) {
            k = 1;
            System.out.print( i + "*" + k + " = " + (i*k));
            k++;
            while (k <= 10) {
                System.out.print(", " + i + "*" + k + " = " + (i*k) );
                k++;
            }
            System.out.println();
            i++;
        }

    }
}
