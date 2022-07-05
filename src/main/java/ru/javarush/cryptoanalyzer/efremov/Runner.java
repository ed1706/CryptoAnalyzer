package ru.javarush.cryptoanalyzer.efremov;

import ru.javarush.cryptoanalyzer.efremov.app.Application;
import ru.javarush.cryptoanalyzer.efremov.app.Result;
import ru.javarush.cryptoanalyzer.efremov.controller.MainController;

public class Runner {
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(args));
        MainController mainController = new MainController();
        Application application = new Application(mainController);
        Result result = application.run(args);
        System.out.println(result);
    }
}
