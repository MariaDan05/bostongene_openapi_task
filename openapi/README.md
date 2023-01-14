# Тестовое задание BostonGene

## Описание
Предлагается реализовать backend java приложение с использованием Spring Boot https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started.html. 
Приложение должно реализовывать API, описанное в Open API Specification drugs-api.yml. Спецификацию в более привычном виде можно посмотреть, загрузив её в https://editor.swagger.io/.

## Запуск программы
Для того, чтобы запустить программу необходимо:
1. В терминале проекта(где находится файл docker-compose.yml) запустить команду "docker-compose up" для подключения к базе данных.
2. Далее запустить метод main, который находится в классе OpenapiApplication(src/main/java/com/task/openapi/OpenapiApplication.java) для запуска программы.
3. Перейдя на страницу http://localhost:8080/swagger-ui/index.html, вы найдете swagger ui полученный по спецификации drugs-api.yml.

## Используемые технологии
1. Java 17
2. Spring boot 3.0.1
3. PostgreSQL
4. Jackson в качестве библиотеки для сериализации/десериализации JSON
5. Maven
