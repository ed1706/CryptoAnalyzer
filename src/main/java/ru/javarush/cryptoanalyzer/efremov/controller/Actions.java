package ru.javarush.cryptoanalyzer.efremov.controller;

import ru.javarush.cryptoanalyzer.efremov.commands.Action;
import ru.javarush.cryptoanalyzer.efremov.commands.Decoder;
import ru.javarush.cryptoanalyzer.efremov.commands.Encoder;

public enum Actions {
    ENCODE(new Encoder()), DECODE(new Decoder());

    private final Action action;

    Actions(Action action) {
        this.action = action;
    }

    public static Action find(String command) {
        Action action;
        action = Actions.valueOf(command.toUpperCase()).action;
        return action;
    }
}
