public class TipeDataArray {
    public static void main(String[] args) {

        // membuat array
        String[] myArray;
        myArray = new String[3];

        // update data array
        myArray[0] = "Satu";
        myArray[1] = "Dua";
        myArray[2] = "Tiga";

        // mencetak nilai array
        System.out.println(myArray[0]);

        String[] namaSiswa = new String[2];
        namaSiswa[0] = "Nursalim";
        namaSiswa[1] = "Albert";

        String[] merkMobil = new String[] {"Toyota", "Suzuki"};

        String[] namaBuah = {"Semangka", "Manggis"};

        // array length
        int panjangArray = namaBuah.length;

        // array di dalam array
        String[][] namaMobil = {
                {"Mobilio", "Jazz", "Civic"},
                {"Camry", "Avanza", "Vios"},
                {"Karimun", "APV", "Jimmy"}
        };

        System.out.println(namaMobil[0][1]);
    };
}
