package nursalim.dev.util;

import nursalim.dev.annotation.NotBlank;
import nursalim.dev.exception.BlankException;
import nursalim.dev.exception.ValidationException;
import nursalim.dev.record.LoginRequest;

import java.lang.reflect.Field;

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

    public static void validateRuntime(LoginRequest loginRequest) {
        if (loginRequest.userName() == null) {
            throw new BlankException("Username is null");
        } else if (loginRequest.userName().isBlank()) {
            throw new BlankException("Username is blank");
        } else if (loginRequest.password() == null) {
            throw new BlankException("Password is null");
        } else if (loginRequest.password().isBlank()) {
            throw new BlankException("Password is blank");
        }
    }

    public static void validateReflection(Object object) {
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field: fields) {
            if(field.getAnnotation(NotBlank.class) != null) {
                field.setAccessible(true);
                String value = null;
                try {
                    value = (String) field.get(object);
                    if(value == null || value.isBlank()) {
                        throw new BlankException("Field " + field.getName() + "is blank");
                    }
                } catch (IllegalAccessException e) {
                    System.out.println("Tidak bisa akses field: " + field.getName());
                }
            }
        }
    }
}
