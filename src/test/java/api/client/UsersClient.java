package api.client;

import api.utils.dto.userReg.Registration;
import api.utils.dto.userReg.Token;
import api.utils.dto.users.Users;


public class UsersClient {
    private final Client client;

    public UsersClient() {
        this.client = new Client();
    }
    public Token registration(Registration user) {
        return client.postRequest("api/register", user, Token.class);
    }

    public Users getUsers() {
        return client.getRequest("/api/users?page=2", Users.class, 1500L);
    }
}
