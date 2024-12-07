import java.util.Scanner;

public class konversi {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        float cm, m, inci;

        System.out.println("Input ukuran dalam meter : ");
        m = input.nextFloat();
        cm = m * 100;
        inci = m * 100 / 2.54f;

        System.out.println("ukuran dalam cm = " + cm);
        System.out.println("ukuran dalam inci = " + inci);
    }
}
