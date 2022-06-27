package io.qameta.homework;

import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Owner("admin1")
@Feature("Авторизация")
@Story("Авторизация через сторонние системы")
public class AuthTests {

    @Test
    @AllureId("10710")
    @DisplayName("Авторизация через Google")
    @Tags({@Tag("blocker"), @Tag("web")})
    public void testGoogleAuth() {
        step("Открываем главную страницу");
        step("Нажимаем кнопку Авторизация");
        step("Выбираем способ авторизации через Google");
        step("Авторизуемся как пользователь 'user_name'", () -> {
            step("Вводим логин 'user_login'");
            step("Вводим пароль 'user_password'");
            step("Нажимаем кнопку Войти");
        });
        step("Должны оказаться на главной странице сайта");
        step("Профиль пользователя должен быть заполнен из Google", () -> {
            step("Имя 'user_name'");
            step("Login 'user_login'");
            step("Аватарка ");
        });
        step("Разлогиниваемся");
    }
}
