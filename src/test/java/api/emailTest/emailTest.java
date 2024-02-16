package api.emailTest;

import api.Secification.Specification;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static api.emailTest.Scenario.*;
import static api.utils.dto.userReg.Registration.user;

@ExtendWith(Specification.class)
public class emailTest {

    @Test
    void checkEmail() {
        var token = getToken(user("eve.holt@reqres.in", "pistol"));
        var userInfoDtos = getUsers();
        userEmailsContains(userInfoDtos, "'");
    }
}
