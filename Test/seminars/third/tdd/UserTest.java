package seminars.third.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    /**
     * 3.6. Нужно написать класс User (пользователь) с методом аутентификации по логину и паролю,
     * (В метод передаются логин и пароль, метод возвращает true, если пароль и логин совпадают, иначе - false)
     */
    @Test
    void userCreationSuccess() {
        User user = new User("qwe", "asd");
        assertTrue(user.authMethod("qwe", "asd"));
    }

    @Test
    void userCreationFailed() {
        User user = new User("qwe", "asd");
        assertFalse(user.authMethod("zxc", "asd"));
    }
}