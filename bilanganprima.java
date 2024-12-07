
import java.util.Scanner;

public class bilanganprima {
    public static void main(String[] args) {
        //NAJWA AREEFA GHAISANI_103122400028//
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int bagi = 0;
        for (int i = 2; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                if (i % j == 0) bagi++;
            }
            if(bagi <= 2){
                System.out.println(i + "Prima");
            }
            else System.out.println(i + "Bukan Prima");
            bagi = 0;
        }

    }
}
