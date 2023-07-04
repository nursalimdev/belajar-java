package nursalim.dev.app;

import nursalim.dev.record.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("nursalim", "password");
        System.out.println(loginRequest.userName());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("Nursalim"));

        loginRequest.sayHello();

    }
}
