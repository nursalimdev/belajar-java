class VicePresident extends Manager {
    VicePresident() {
        super(null);
    }

    VicePresident(String name) {
        super(name);
    }
    void sayHello(String name) {
        System.out.println("Hello " + name + ", my name is VP " + this.name);
    }
}
