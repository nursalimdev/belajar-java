public class TipeDataNonPrimitif {
    public static void main(String[] args) {
        Integer myInteger = 100;
        Boolean myBoolean = true;
        Character myChar = 'B';

        Short myShort; // null
        myShort = 100;

        Byte myByte = null;
        System.out.println(myByte);

        // Konversi dari primitif ke bukan primitif
        int thisInt = 10;
        Integer intObject = thisInt;

        int thisIntAgain = intObject;
        short thisShort = intObject.shortValue();
        byte thisByte = intObject.byteValue();

    }
}
