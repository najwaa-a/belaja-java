package latihanCoding3;

import java.util.Scanner;

public class no3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Input jumlah koin drachma: ");
        int drachma = input.nextInt();

        int atticTallents = drachma / (60 * 100);
        int remainingAfterTallents = drachma % (60 * 100);

        int mine = remainingAfterTallents / 100;
        int remainingAfterMine = remainingAfterTallents % 100;

        int oboli = remainingAfterMine * 6;

        System.out.println("Attic Tallents: " + atticTallents);
        System.out.println("Mine: " + mine);
        System.out.println("Oboli: " + oboli);

    }


}
