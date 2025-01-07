package latihanCoding4;

import java.util.Scanner;

public class no5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    System.out.print("Input 3 angka: ");

    int x = input.nextInt();
    int y = input.nextInt();
    int z = input.nextInt();

    if (x >= y) { // jika x lebih besar atau sama dengan y
        if (y >= z) { // jika y lebih besar atau sama dengan z
            System.out.println(z + " " + y + " " + x); // oututnya akan mengurutkan dari kecil ke besar dari z > y > x
        }
        if (z >= x) {  // jika z lebih besar atau sama dengan x
            System.out.println(y + " " + x + " " + z);  // outputnya akan mengurutkan dari kecil ke besar dari y > x > z
        }
        if (x > z) {  // jika x lebih besar dari z > y
            System.out.println(y + " " + z + " " + x);  // outputnya akan mengurutkan dari kecil ke besar dari y > z > x
        }
    }

    if (y > x)  // jika y lebih besar dari x > z
    {
        if (z >= y)   // jika z lebih besar atau sama dengan y
            System.out.print( x + " " + y + " "+ z);  // outputnya akan mengurutkan dari kecil ke besar dari x > y > z
        if (z >= x)   // jika z lebih besar atau sama dengan x
            System.out.print( y + " " + x + " " + z);  // outputnya akan mengurutkan dari kecil ke besar dari y > x > z
        if (x > z)   // jika x lebih besar dari z > y
            System.out.print(y + " " + z + " " + x);   // outputnya akan mengurutkan dari kecil ke besar dari y > z > x
    }

    }
}
