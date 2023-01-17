# Проект по автоматизации тестирования API для [reqres.in](https://reqres.in/)

## Содержание

- [Технологии и инструменты](#технологии-и-инструменты)
- [Реализованныe проверки](#реализованные-проверки)
- [Запуск тестов из терминала](#запуск-тестов-из-терминала)
- [Запуск тестов в Jenkins](#запуск-тестов-в-jenkins)
- [Отчет о результатах тестирования в Allure Report](#отчет-о-результатах-тестирования-в-Allure-report)
- [Интеграция с Allure TestOps](#интеграция-с-allure-testops)
- [Интеграция с Jira](#интеграция-с-jira)
- [Уведомления в Telegram с использованием бота](#уведомления-в-telegram-с-использованием-бота)

## Технологии и инструменты

<p  align="center">

<img width="5%" title="IntelliJ IDEA" src="media/icons/Idea.svg">
<img width="5%" title="Java" src="media/icons/Java.svg">
<img width="5%" title="Gradle" src="media/icons/Gradle.svg">
<img width="5%" title="Gradle" src="media/icons/RestAssured.svg">
<img width="5%" title="Junit5" src="media/icons/Junit5.svg">
<img width="5%" title="GitHub" src="media/icons/GitHub.svg">
<img width="5%" title="Allure Report" src="media/icons/Allure.svg">
<img width="5%" title="Allure TestOps" src="media/icons/Allure_TO.svg">
<img width="5%" title="Jenkins" src="media/icons/Jenkins.svg">
<img width="5%" title="Jira" src="media/icons/Jira.svg">
<img width="5%" title="Telegram" src="media/icons/Telegram.svg">
</p>

## Реализованные проверки

- [x] *Успешная регистрация*
- [x] *Неуспешная регистрация*
- [x] *Успешная авторизация*
- [x] *Неуспешная авторизация*
- [x] *Создание нового пользователя*
- [x] *Обновление данных пользователя*
- [x] *Поиск пользователя*
- [x] *Удаление пользователя*

## Запуск тестов из терминала

```bash
gradle clean test
```

## Запуск тестов в [Jenkins](https://jenkins.autotests.cloud/job/final_project_api/)

#### Главная страница Jenkins

<p align="center">
  <img src="media/screen/jenkins_mainpage.PNG" alt="Jenkins" width="800">
</p>

Для запуска сборки необходимо нажать кнопку <code><strong>*Собрать сейчас*</strong></code>.

Результаты сборки можно посмотреть в Allure отчёте, кликнув на значок <code><strong>*Allure Report*</strong></code>.

#### Значок Allure Report

<p align="center">
  <img src="media/screen/jenkins_allure.png" alt="jenkins_allure" width="800">
</p>

## Отчет о результатах тестирования в [Allure Report](https://jenkins.autotests.cloud/job/final_project_api/allure/)

#### Главная страница Allure Report

<p align="center">
  <img src="media/screen/allure_mainpage.PNG" alt="allure_main" width="800">
</p>

#### Тесты

<p align="center">
  <img src="media/screen/allure_tests.PNG" alt="allure_tests" width="800">
</p>

#### Графики

<p align="center">
  <img src="media/screen/allure_graphs.PNG" alt="allure_graphs" width="800">
</p>

## Интеграция с [Allure TestOps](https://allure.autotests.cloud/launch/18515)

#### Тест-кейсы

<p align="center">
  <img src="media/screen/testops_tests.PNG" alt="testops_tests" width="800">
</p>

#### Дашборды

<p align="center">
  <img src="media/screen/dashboards.PNG" alt="dashboards" width="800">
</p>

## Интеграция с [Jira](https://jira.autotests.cloud/browse/HOMEWORK-503)

#### Задача в Jira

<p align="center">
  <img src="media/screen/jira.PNG" alt="jira" width="800">
</p>

## Уведомления в Telegram с использованием бота

#### Оповещение о результатах сборки

<p align="center">
  <img src="media/screen/telegram.PNG" alt="telegram" width="800">
</p>
