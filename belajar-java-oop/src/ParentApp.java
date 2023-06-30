public class ParentApp {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "Nursalim";
        child.doIt();
        System.out.println(child.name);

        // konversi ke parent
        Parent parent = child;
        parent.doIt();
        System.out.println(parent.name);
    }
}
