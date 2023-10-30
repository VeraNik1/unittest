import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tdd.User;
import tdd.UserRepository;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;


class testUsers {
    User adminUser;
    User user1;
    User user2;
    User user3;
    UserRepository userRepository;

    @BeforeEach
    void setUp() {
        //cоздаём юзеров
        adminUser = new User("admin", "admin", true);
        user1 = new User("carina", "sdgf2", false);
        user2 = new User("olyalya", "rewit", false);
        user3 = new User("peter", "evlsn", false);

        //добавляем юзеров в UserRepository
        userRepository = new UserRepository();
        userRepository.addUser(adminUser);
        userRepository.addUser(user1);
        userRepository.addUser(user2);
        userRepository.addUser(user3);

        //юзеры проходят аутентификацию
        userRepository.authenticate("admin", "admin");
        userRepository.authenticate("carina", "sdgf2");
        userRepository.authenticate("olyalya", "rewit");
        userRepository.authenticate("peter", "evlsn");
    }

    @ParameterizedTest
    @CsvSource(value = {"admin, admin", "carina, sdgf2", "olyalya, rewit", "peter, evlsn"})
    @DisplayName("All users authenticated successfully!")
    public void testAllUsersAuthenticate(String name, String password) {
        assertTrue(userRepository.authenticate(name, password));
    }

    @ParameterizedTest
    @CsvSource(value = {"admin", "carina", "andrew", "peter"})
    @DisplayName("All users except admins were logged out")
    public void testLogoutAllUsersExceptAdmins(String name) {
        userRepository.logoutAllUsersExceptAdmins();
        for (User user : userRepository.getData()) {
            if (user.getName() == name) {
                assertThat(user.getIsAdmin()).isEqualTo(user.isLogged());
            }
        }
    }
}


