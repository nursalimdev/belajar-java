public class SwitchYield {
    public static void main(String[] args) {
        var nilai = "A";
        String ucapan = switch (nilai) {
            case "A":
                yield "Wow Anda lulus dengan baik";
            case "B", "C":
                yield "Anda lulus";
            case "D":
                yield "Anda gagal";
            default:
                yield "Anda mungkin salah jurusan";
        };

        System.out.println(ucapan);
    }
}
