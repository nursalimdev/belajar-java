import java.util.Scanner;

public class AplikasiTodolist {
    public static String[] model = new String[10];
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        viewShowTodolist();
    }

    /**
     * Menampilkan todolist
     */
    public static void showTodolist() {
        System.out.println("TODOLIST");
        for(var i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

            if(todo != null) {
                System.out.println(no + ". " + todo);
            }
        }
    }

    public static void testShowTodolist() {
        model[0] = "Belajar Java Dasar";
        model[1] = "Belajar Java Generic";
        showTodolist();
    }

    /**
     * Menambah todolist
     */
    public static void addTodolist(String todo) {
        var penuh = true;
        // cek apakah model penuh
        for (var i = 0; i < model.length; i++) {
            if(model[i] == null) {
                // model masih ada yang kosong
                penuh = false;
                break;
            }
        }

        // jika penuh, resize ukuran array 2 kali lipat
        if(penuh) {
            var temp = model;
            model = new String[model.length * 2];

            for (var i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

        // tambahkan ke posisi data array nya null
        for(var i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }
    }

    public static void testAddTodolist() {
        for (var i = 0; i < 25; i++) {
            addTodolist("Contoh todo ke-" + i);
        }
        showTodolist();
    }

    /**
     * Menghapus todolist
     */
    public static boolean removeTodolist(Integer nomor) {
        if((nomor - 1) >= model.length) {
            return false;
        }else if (model[nomor - 1] == null) {
            return false;
        }else{
            // geser
            for (var i = (nomor - 1); i < model.length; i++) {
                if(i == model.length - 1) {
                    model[i] = null;
                }else{
                    model[i] = model[i + 1];
                }
            }
            return true;
        }
    }

    public static void testRemoveTodolist() {
        addTodolist("satu");
        addTodolist("dua");
        addTodolist("tiga");
        addTodolist("empat");
        addTodolist("lima");

        var result = removeTodolist(20);
        System.out.println(result);

        result = removeTodolist(7);
        System.out.println(result);

        result = removeTodolist(2);
        System.out.println(result);

        showTodolist();
    }

    public static String input(String info) {
        System.out.print(info + ": ");
        String data = scanner.nextLine();
        return data;
    }

    public static void testInput() {
        var data = input("Nama");
        System.out.println("Hi " + data);
    }

    /**
     * Menampilkan view show todolist
     */
    public static void viewShowTodolist() {
        while (true) {
            showTodolist();
            System.out.println("Menu");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = input("Pilih");
            if (input.equals("1")) {
                viewAddTodolist();
            } else if (input.equals("2")) {
                viewRemoveTodolist();
            }else if(input.equals("x")){
                break;
            } else {
                System.out.println("Pilihan tidak ada");
            }
        }
    }

    public static void testViewShowTodolist() {
        addTodolist("Satu");
        addTodolist("Dua");
        addTodolist("Tiga");
        addTodolist("Empat");
        addTodolist("Lima");

        viewShowTodolist();
    }

    /**
     * Menampilkan view add todolist
     */
    public static void viewAddTodolist() {
        System.out.println("MENAMBAH TODOLIST");
        var todo = input("Todo (x jika batal)");
        if(todo.equals("x")) {
            // batal
        }else{
            addTodolist(todo);
        }
    }

    public static void testViewAddTodolist() {
        addTodolist("Satu");
        addTodolist("Dua");
        viewAddTodolist();
        showTodolist();
    }

    /**
     * Menampilkan view remove todolist
     */
    public static void viewRemoveTodolist() {
        System.out.println("MENGHAPUS TODOLIST");
        var nomor = input("Nomor yang dihapus (x jika batal)");
        if(nomor.equals("x")) {
            // batal
        }else{
            boolean success = removeTodolist(Integer.valueOf(nomor));

            if(!success){
                System.out.println("Gagal menghapus todolist: " + nomor);
            }
        }

    }

    public static void testViewRemoveTodolist() {
        addTodolist("Satu");
        addTodolist("Dua");
        addTodolist("Tiga");
        showTodolist();

        viewRemoveTodolist();
        showTodolist();
    }
}
