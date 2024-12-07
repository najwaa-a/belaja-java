import java.util.Scanner;

public class luasPersegiPanjang {

    static int hitungPersegiPanjang (int p, int l) {
        int luas = p*l;
        return luas;
    }

    //NAJWA AREEFA GHAISANI_10312240028//

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Input Panjang :");
    int p = input.nextInt();

    System.out.print("Input lebar :");
    int l = input.nextInt(); 
    
    int hasil = hitungPersegiPanjang(p, l);
        
    
        System.out.println("Luas persegi panjang:" + hasil );
        }
    
    
}
