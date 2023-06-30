class Person {
    String name;
    String address;
    final String country = "Indonesia";

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Person(String paramName) {
        this(paramName, null);
    }

    public Person(){
        this(null);
    }

    public void sayHello(String name) {
        System.out.println("Hello " + this.name + ", my name is " + name);
    }
}
