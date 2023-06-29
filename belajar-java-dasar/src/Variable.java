public class Variable {
    public static void main(String[] args) {
        String nama;
        nama = "Nursalim";

        int umur = 25;
        String alamat = "Jakarta";

        System.out.println(nama);
        System.out.println(umur);
        System.out.println(alamat);

        // Menggunakan kata kunci var
        var hobi = "Memancing";
        var gaji = 15_000_000;
        System.out.println(hobi);
        System.out.println(gaji);

        final String status = "Single";
        System.out.println(status);

//        status = "Married"; // error
    }
}
