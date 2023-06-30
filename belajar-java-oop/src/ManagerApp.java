public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Nursalim");
//        manager.name = "Nursalim";
        manager.sayHello("Budi");

        var vp = new VicePresident();
        vp.name = "Ziah";
        vp.sayHello("Naura");
    }
}
