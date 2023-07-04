package nursalim.dev.record;

public record LoginRequest(String userName, String password) {
    // constructor
    public LoginRequest {
        System.out.println("Ini adalah contructor dari record class");
    }

    // contructor overloading
    public LoginRequest(String userName) {
        this(userName, "");
    }

    public LoginRequest() {
        this("", "");
    }

    // membuat method
    public void sayHello() {
        System.out.println("Hello " + this.userName);
    }
}
