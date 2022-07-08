package ru.javarush.cryptoanalyzer.efremov.controller;

import ru.javarush.cryptoanalyzer.efremov.commands.Action;
import ru.javarush.cryptoanalyzer.efremov.entity.Result;

public class MainController {
    public Result execute(String command, String[] parameters) {
        Action action = Actions.find(command);
        Result result = action.execute(parameters);
        return result;
    }
}
