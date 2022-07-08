package ru.javarush.cryptoanalyzer.efremov.commands;

import ru.javarush.cryptoanalyzer.efremov.entity.Result;

public interface Action {
    Result execute(String[] parameters);
}
