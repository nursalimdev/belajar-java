public class MethodReturnValue {
    public static void main(String[] args) {
        var nilai1 = 100;
        var nilai2 = 50;
        var hasil = sum(nilai1, nilai2);
        System.out.println(hasil);

        System.out.println(hitung(10, "+", 5));
    }

    static int sum(int value1, int value2) {
        var hasil = value1 + value2;
        return hasil;
    }

    static int hitung(int value1, String operasi, int value2) {
        switch (operasi) {
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            case "/":
                return value1 / value2;
            case "*":
                return value1 * value2;
            default:
                return 0;
        }
    }
}
