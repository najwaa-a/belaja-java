package quizMethodTanpaPengembalian;

import java.util.Scanner;

public class quizNo5 {

    static void tanki(int tanki, int[] ember, int jumlah) {


        for (int volume : ember) {
            jumlah += volume; 

            if (jumlah >= tanki) {
                System.out.println("cukup : true");
                return;
            } 
        }
        System.out.println("tidak cukup : false");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input volume tanki: ");
        int tanki = input.nextInt();
        if (tanki < 0) {
            System.out.println("Volume tanki tidak boleh negatif.");
            return;
        }

        System.out.print("Input jumlah ember: ");
        int totalEmber = input.nextInt();
        if (totalEmber < 0) {
            System.out.println("Jumlah ember tidak boleh negatif.");
            input.close();
            return;
        }

        int[] ember = new int[totalEmber];

        System.out.println("Input volume setiap ember:");
        for (int i = 0; i < totalEmber; i++) {
            ember[i] = input.nextInt();
            if (ember[i] < 0) {
                System.out.println("Volume ember tidak boleh negatif.");
                input.close();
                return;
            }
        }


        tanki(tanki, ember, 0); 

    
    }
}
