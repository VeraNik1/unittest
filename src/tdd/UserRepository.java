package tdd;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    private final List<User> data = new ArrayList<>();

    public List<User> getData() {
        return data;
    }

    public UserRepository() {
    }

    // добавление нового пользователя
    public void addUser(User user) {
        if (!findByName(user.name)) {
            data.add(user);
        } else {
        }
    }

    public void deleteUser(User user) {
        if (findByName(user.name)) {
            data.remove(user);
        } else {
        }
    }

    // поиск пользователя
    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

    // аутентификация пользователя

    public boolean authenticate(String log_name, String pass) {
        for (User user : data) {
            if (Objects.equals(user.name, log_name) && Objects.equals(user.password, pass)) {
                user.setLogged(true);
                return true;
            }
        }
        return false;
    }

        // разлогинивает всех пользователей, кроме администраторов
        public void logoutAllUsersExceptAdmins() {
            for (User user : data) {
                if (!user.isAdmin && user.isLogged()) {
                    user.setLogged(false);
                }
            }
        }


}