package nursalim.dev.data;

public class Application {
    public static final int PROCESSOR;

    static {
        System.out.println("Access Application class");
        PROCESSOR = Runtime.getRuntime().availableProcessors();
    }

    public static void main(String[] args) {
    }
}
