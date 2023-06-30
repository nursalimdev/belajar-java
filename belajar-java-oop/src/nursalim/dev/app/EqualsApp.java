package nursalim.dev.app;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Nursalim";
        first = first + " " + "Aja";
        System.out.println(first);

        String second = "Nursalim Aja";
        System.out.println(first == second);
        System.out.println(first.equals(second));

        String third = "Nursalim Aja";
        System.out.println(second == third);
        System.out.println(second.equals(third));
    }
}
