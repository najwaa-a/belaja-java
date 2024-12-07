import java.util.Scanner;

public class Method8 {
    
    public static int pembagianLoop(int n, int m) {
        
        int total = 0;  
        while (n >= m) {  
            n = n - m;  
            total++;  
        }
        return total;  
    }

    public static void main(String[] args) {
     
        Scanner Input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n: ");
        int n = Input.nextInt();
        
        System.out.print("Masukkan nilai m: ");
        int m = Input.nextInt();

        int hasil = pembagianLoop(n, m);
        System.out.println("Hasil pembagian " + n + " dengan " + m + " adalah: " + hasil);

    }
}

