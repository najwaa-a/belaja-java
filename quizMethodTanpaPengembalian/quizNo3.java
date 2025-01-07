package quizMethodTanpaPengembalian;

public class quizNo3 {

    static void cariGo(char[] kar) {
        int hitung = 0;

        for (int i = 0; i < kar.length; i++) {
            if (kar[i] == 'g' && kar[i + 1] == 'o') {
                hitung++;
            }
        }

        System.out.println(hitung);

    }

    public static void main(String[] args) {
        String input1 = "inigolang.";
        String input2 = "inigolanginggolang.";

        cariGo(input1.toCharArray());
        cariGo(input2.toCharArray());

    }
}
