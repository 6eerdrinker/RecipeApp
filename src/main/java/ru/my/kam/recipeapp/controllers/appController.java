package ru.my.kam.recipeapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Создаем класс контроллера ресурсов
@RestController
public class appController {

    @GetMapping
    public String recipeApp() {
        return "Приложение запущено.";
    }

    @GetMapping("/info")
    public String info() {
        return "Студент: Александр Клемперт;   " +
                "Проект 'Создание веб-приложения кулинарных рецептов';   " +
                "Дата создания: 12.12.2022;  " +
                "Данное приложение по названию рецепта выдает список ингредиентов блюда и их количество,  " +
                "так же подробно описывается пошаговое приготовление блюда;  " +
                "Приложение создано с использованием фреймворка Spring (зависимостей Spring Web) " +
                "и сборщика артефактов Maven," +
                "на основе службы принимающей HTTP-запросы GET по адресу http://localhost:8080/info  ";
}
}
