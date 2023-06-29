public class ForLoop {
    public static void main(String[] args) {
        // perulangan tanpa henti
//        for (;;) {
//            System.out.println("Perulangan tanpa henti");
//        }

        // perulangan dengan kondisi
        var count = 1;
        for(; count <= 10; ){
            System.out.println("Perulangan ke-" + count);
            count++;
        }

        // perulangan dengan init statement;
        for(var counter = 1; counter <= 10; ) {
            System.out.println("Perulangan ke-" + counter);
            counter++;
        }

        // perulangan dengan post statement
        for(var cacah = 1; cacah <= 10; cacah++) {
            System.out.println("Perulangan ke-" + cacah);
        }
    }
}
