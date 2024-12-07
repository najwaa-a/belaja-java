
import java.util.Scanner;

public class Method4 {
    
    public static double fungsiY(double x) {
        

        if (x == 0) {
            System.out.println(" x tidak boleh 0");
            return -1;
        }
        return 1 / x;

    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Input x :");
        double x = Input.nextDouble();

        double hasil = fungsiY(x);
        if (hasil == -1) {
            System.out.println("hasil tidak valid x = " + x);
        } else {
            System.out.println(hasil);
        }


    }
       
        

}
