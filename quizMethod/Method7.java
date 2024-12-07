import java.util.Scanner;

public class Method7 {
    public static int penjumlahan(int N) {
        int jumlah = 0;
        
        for (int i = 1; i <= N; i++) {
            jumlah += i;
        }
        return jumlah;
    }

    public static void main(String[] args) {
       
        Scanner Input = new Scanner(System.in);
        System.out.print("Input nilai N: ");
        int N = Input.nextInt();

        
        int total = penjumlahan(N);

       
        System.out.println("Hasil penjumlahan dari 1 hingga " + N + " adalah: " + total);
    }
}

