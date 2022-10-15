package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @DisplayName("Открытие главной страницы")
    void OpenMainPage() {
        step("Открыть страницу'https://javarush.ru'", () ->
                open("https://javarush.ru"));

        step("Проверить наименование заголовка", () -> {
            String expectedTitle = "Javarush - онлайн-курс обучения программированию на Java";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @DisplayName("Открытие страницы \"Отзывы\"")
    void OpenReviewsPage() {
        step("Открыть страницу 'https://javarush.ru'", () ->
                open("https://javarush.ru"));

        step("Кликнуть по кнопке \"Отзывы\" в хедере", () ->
                $(byTagAndText("a", "Отзывы")).click()
        );

        step("Проверить наименование заголовка", () ->
                $(".article-head__title").shouldHave(text("Отзывы"))
        );
    }

    @Test
    @DisplayName("Открытие страницы \"О нас\"")
    void OpenAboutPage() {
        step("Открыть страницу 'https://javarush.ru'", () ->
                open("https://javarush.ru"));

        step("Кликнуть по кнопке \"О нас\" в хедере", () ->
                $(byTagAndText("a", "О нас")).click()
        );

        step("Проверить наименование заголовка", () ->
                $(".article-head__title").shouldHave(text("О JavaRush"))
        );
    }

    @Test
    @DisplayName("Открытие страницы \"CS50\"")
    void OpenCS50Page() {
        step("Открыть страницу 'https://javarush.ru'", () ->
                open("https://javarush.ru"));

        step("Кликнуть по кнопке \"CS50\" в хедере", () ->
                $(byTagAndText("a", "CS50")).click()
        );

        step("Проверить наименование заголовка", () ->
                $(".quest__title").shouldHave(text("Harvard CS50"))
        );
    }

    @Test
    @DisplayName("Открытие страницы \"Начать обучение\"")
    void OpenStartLearningPage() {
        step("Открыть страницу 'https://javarush.ru'", () ->
                open("https://javarush.ru"));

        step("Кликнуть \"Начать обучение\"", () ->
                $("#button_menu_start_learning_unauthorized_user").click()
        );

        step("Проверить наименование заголовка 'Отзывы'", () ->
                $(".quiz-home-section__head").shouldHave(text("Здесь становятся Java-программистами "))
        );
    }

    @Test
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://javarush.ru'", () ->
                open("https://javarush.ru"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}