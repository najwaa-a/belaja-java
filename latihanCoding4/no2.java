package latihanCoding4;

import java.util.Scanner;

public class no2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("kondisi cuaca ? (true = tidak hujan, false = hujan)" ); // input kondisi cuaca
        boolean tidakhujan = input.nextBoolean();
        
        System.out.println("Kondisi mood? (true = bagus, false = tidak bagus)");
        boolean mood = input.nextBoolean();


        if (tidakhujan && mood) {
            System.out.println("keluar jalan - jalan"); // true && true
        } else { // 
            System.out.println("diam dirumah saja"); // false && false
        }


    }
}
