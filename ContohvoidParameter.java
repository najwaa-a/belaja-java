public class ContohvoidParameter {
    void tambahNilai (int x) {
        x += 10;
        System.out.println("Nilai setelah ditambah: " + x);
    }

    public static void main(String[] args) {
        int nilai = 5;

        ContohvoidParameter obj = new ContohvoidParameter();

        obj.tambahNilai(nilai);
        System.out.println("Nilai asli:" + nilai);
    }
}
