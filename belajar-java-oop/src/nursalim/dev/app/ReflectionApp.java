package nursalim.dev.app;

import nursalim.dev.data.CreateUserRequest;
import nursalim.dev.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {
        CreateUserRequest createUserRequest = new CreateUserRequest();
        ValidationUtil.validateReflection(createUserRequest);
    }
}
