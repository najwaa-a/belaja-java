public class populasi {
    public static void main(String[] args) {
        
        int populasi = 312032486;
        int detik = 365 * 24 * 60 * 60;

        int kelahiran = detik / 7;
        int kematian = detik / 13;
        int imigram = detik / 45;

        for (int i = 1; i <= 5; i++) {
            populasi += kelahiran - kematian + imigram;
        } 
        System.out.println(populasi);

    }
}
