public class AplikasiTodolist {
    public static String[] model = new String[10];
    public static void main(String[] args) {
        testRemoveTodolist();
    }

    /**
     * Menampilkan todolist
     */
    public static void showTodolist() {
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
            model[nomor - 1] = null;
            return true;
        }
    }

    public static void testRemoveTodolist() {
        addTodolist("satu");
        addTodolist("dua");
        addTodolist("tiga");

        var result = removeTodolist(3);
        System.out.println(result);
        showTodolist();
    }

    /**
     * Menampilkan view show todolist
     */
    public static void viewShowTodolist() {

    }

    /**
     * Menampilkan view add todolist
     */
    public static void viewAddTodolist() {

    }

    /**
     * Menampilkan view remove todolist
     */
    public static void viewRemoveTodolist() {

    }
}
