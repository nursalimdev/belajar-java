package nursalim.dev.app;

import nursalim.dev.exception.ValidationException;
import nursalim.dev.record.LoginRequest;
import nursalim.dev.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        try {
            ValidationUtil.validate(new LoginRequest("", null));
        } catch (ValidationException | NullPointerException e) {
            System.out.println("Terjadi error " + e.getMessage());
        }
    }
}
