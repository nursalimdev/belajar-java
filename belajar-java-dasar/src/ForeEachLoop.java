public class ForeEachLoop {
    public static void main(String[] args) {
        // Tanpa foreach
        String[] namaBuah = {"Apel", "Mangga", "Jeru"};
        for(var i = 0; i < namaBuah.length; i++) {
            System.out.println(namaBuah[i]);
        }

        // dengan foreach
        for(String buah: namaBuah) {
            System.out.println(buah);
        }
    }
}
