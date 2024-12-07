public class Calculatortest {
    public static void main(String[] args) {
        int angka1 = 20;
        int angka2 = 7;

        int tambahResult = angka1 + angka2;
        int kurangResult = angka1 - angka2;
        int kaliResult = angka1 * angka2;
        int bagiResult = angka1 / angka2;
        int sisaResult = angka1 % angka2;


        System.out.println("angka 1 = 20 ");
        System.out.println("angka 2 = 7");
        System.out.println("<--------------------------->");
        System.out.println("Hasil Penambahan = " + tambahResult);
        System.out.println("Hasil Penguarangan = " + kurangResult);
        System.out.println("Hasil Perkalian = " + kaliResult);
        System.out.println("Hasil Pembagian = " + bagiResult);
        System.out.println("Hasil sisa bagi = " + sisaResult);
        
    }
}
