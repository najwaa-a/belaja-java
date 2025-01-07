package latihanCoding3;

public class no4 {
    import java.util.Scanner;



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Masukkan panjang dalam feet: ");
        double feet = scanner.nextDouble();

    
        double meters = feet * 0.3048;


        System.out.println(feet + " feet sama dengan " + meters + " meter.");

        scanner.close();
    }
}


