public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("Wow Anda lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("Anda lulus");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Anda salah jurusan");
        }
    }
}
