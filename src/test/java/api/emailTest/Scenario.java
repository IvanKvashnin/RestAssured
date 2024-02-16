package api.emailTest;

import api.client.UsersClient;
import api.utils.dto.userReg.Registration;
import api.utils.dto.users.UserInfo;
import io.qameta.allure.Step;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RequiredArgsConstructor
public class Scenario {
    private final static UsersClient userClient = new UsersClient();

    @Step("Регистрируем пользователя: email: {email}, password: {password}")
    protected static String getToken(Registration user) {
        return userClient.registration(user).getToken();
    }

    @Step("Получаем всех пользователей")
    protected static List<UserInfo> getUsers() {
        return userClient.getUsers().getData();
    }

    @Step("Проверяем, что в почте есть символ {symbol}")
    protected static void userEmailsContains(List<UserInfo> userInfoDtos, String symbol) {
        userInfoDtos.forEach(u -> assertThat(u.getEmail()).contains(symbol));
    }
}
