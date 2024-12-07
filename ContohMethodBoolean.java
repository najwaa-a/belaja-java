public class ContohMethodBoolean {
    
    boolean cekGenap (int angka) {
        return angka % 2 == 0;

    }

    public static void main(String[] args) {
        ContohMethodBoolean obj = new ContohMethodBoolean();

        boolean hasil = obj.cekGenap(8);

        if (hasil) {
            System.out.println("Angka tersebut adalah genap");
        } else {
            System.out.println("Angka tersebut adalah ganjil");
        }
    }
}
