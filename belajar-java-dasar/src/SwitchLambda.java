public class SwitchLambda {
    public static void main(String[] args) {
        var nilai = "F";

        switch (nilai) {
            case "A" -> System.out.println("Wow Anda lulus dengan baik");
            case "B", "C" -> System.out.println("Anda lulus");
            case "D" -> System.out.println("Anda gagal");
            default -> System.out.println("Anda salah jurusan");
        }
    }
}
