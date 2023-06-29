public class KonversiTipeDataNumber {
    public static void main(String[] args) {
        // konversi otomatis
        byte myByte = 100;
        short myShort = myByte;
        int myInt = myShort;
        long myLong = myInt;

        // konversi manual
        byte myByte2 = (byte) myInt;
    }
}
