import java.util.Scanner;

public class Method9 {
    public static boolean isPrime(int a) {
        int faktor = 0; 
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) { 
                faktor++;
            }
        }
        return faktor % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
    
        System.out.print("Input bilangan: ");
        int a = Input.nextInt();

        boolean hasil = isPrime(a);

        System.out.println(hasil);
    }
}

