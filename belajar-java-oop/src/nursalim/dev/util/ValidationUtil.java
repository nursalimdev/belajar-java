package nursalim.dev.util;

import nursalim.dev.exception.ValidationException;
import nursalim.dev.record.LoginRequest;

public class ValidationUtil {
    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
        if (loginRequest.userName() == null) {
            throw new NullPointerException("Username is null");
        } else if (loginRequest.userName().isBlank()) {
            throw new ValidationException("Username is blank");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password is null");
        } else if (loginRequest.password().isBlank()) {
            throw new ValidationException("Password is blank");
        }
    }
}
