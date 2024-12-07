
import java.util.Scanner;

public class GradeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, a, b, c, d;

        System.out.println("masukan nilai :");

        int nilai = input.nextInt();

        System.out.println("Input nilai :");

        if (nilai <= 100 && nilai > 89) {
            System.out.println("Nilai A"); 

        } else if (nilai < 90 && nilai > 79) {
            System.out.println("Nilai B");
        } else if (nilai < 80 && nilai > 69) {
            System.out.println("Nilai C");
        } else if (nilai < 70 && nilai > 59) {
            System.out.println("Nilai D");
        } else if (nilai < 60 && nilai >= 0) {
            System.out.println("Nilai E");
        } else {
            System.out.println("Nilai tidak terdaftar");
        }
 

    }
}
