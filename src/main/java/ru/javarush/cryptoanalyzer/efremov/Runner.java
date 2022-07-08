package ru.javarush.cryptoanalyzer.efremov;

import ru.javarush.cryptoanalyzer.efremov.toplevel.Application;
import ru.javarush.cryptoanalyzer.efremov.controller.MainController;
import ru.javarush.cryptoanalyzer.efremov.entity.Result;

public class Runner {
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(args));
        MainController mainController = new MainController();

        //encode text.txt encoded.txt 45
        Application application = new Application(mainController);
        Result result = application.run(args); //text.txt encoded.txt 45
        System.out.println(result);
    }
}
