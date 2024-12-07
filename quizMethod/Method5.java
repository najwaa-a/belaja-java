import java.util.Scanner;

public class Method5 {
    
    public static int hitungLemparan (int uang){
        int lemparan = 0;

        if (uang >= 15000){
            lemparan = (uang - 15000) / 15000 + 80;
        } else if (uang >= 10000) {
            lemparan = (uang - 10000) / 10000 + 45;
        } else if (uang >= 5000) {
            lemparan = (uang - 5000) / 5000 + 4;
        } else if (uang >= 2400) {
            lemparan = (uang - 2400) / 2400 + 2;
        } else if (uang >= 1600){
            lemparan = 1;
        }

        return lemparan;
    }
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Input jumlah uang: ");
        int uang = inp.nextInt();

        int lemparan = hitungLemparan(uang);

        System.out.println("Dapat melakukan " + ( hitungLemparan(uang)) + " lemparan");
    }
}
