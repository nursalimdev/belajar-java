package nursalim.dev.app;

import nursalim.dev.exception.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase(null, null);
        System.out.println("Sukses");
    }

    public static void connectDatabase(String username, String password) {
        if(username == null || password == null) {
            throw new DatabaseError("Tidak bisa koneksi ke database");
        }
    }
}
