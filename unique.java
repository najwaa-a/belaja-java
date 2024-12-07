import java.util.Scanner;

public class unique {

    //NAJWA AREEFA GHAISANI_10312240028//
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kata: ");
        String kata = scanner.nextLine();

        int jumlahKarakterUnik = hitungKarakterUnik(kata);
        System.out.println("Jumlah karakter unik: " + jumlahKarakterUnik);
    }

    private static int hitungKarakterUnik(String kata) {
        boolean[] karakterTerpakai = new boolean[256]; 
        int jumlahUnik = 0;

        for (char c : kata.toCharArray()) {
            if (!karakterTerpakai[c]) {
                karakterTerpakai[c] = true;
                jumlahUnik++;
            }
        }
        return jumlahUnik;
    }
}
