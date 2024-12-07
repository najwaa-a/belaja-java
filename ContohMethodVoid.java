public class ContohMethodVoid {
    void cetakPesan () {
        System.out.println("Ini adalah method tanpa nilai kembalian");
    }

    public static void main(String[] args) {
        ContohMethodVoid obj = new ContohMethodVoid();

        obj.cetakPesan() ;
    }
}
