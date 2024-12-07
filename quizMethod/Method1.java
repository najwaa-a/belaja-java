import java.util.Scanner;

public class Method1 {
    
    public static int penjumlahan(int a, int b, int c, int d ){
            return  a + b + c + d;
    }

public static void main(String[] args) {
    Scanner Input = new Scanner(System.in);

    System.out.print("Input bilangan pertama :");
    int bilangan1 = Input.nextInt();

    System.out.print("Input bilangan kedua :");
    int bilangan2 = Input.nextInt();

    System.out.print("Input bilangan ketiga :");
    int bilangan3 = Input.nextInt();

    System.out.print("Input bilangan keempat :");
    int bilangan4 = Input.nextInt();

    int hasilJumlah = penjumlahan(bilangan1, bilangan2, bilangan3, bilangan4);

    System.out.println("hasil penjumlahan : " + hasilJumlah);
}
    
}
