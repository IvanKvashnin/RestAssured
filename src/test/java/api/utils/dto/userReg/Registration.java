package api.utils.dto.userReg;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Registration {
    private String email;
    private String password;

    public static Registration user(String email, String password) {
        return new Registration(email, password);
    }
}
