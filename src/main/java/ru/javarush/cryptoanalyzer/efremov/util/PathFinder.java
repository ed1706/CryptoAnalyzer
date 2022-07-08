package ru.javarush.cryptoanalyzer.efremov.util;

import java.io.File;

public class PathFinder {
    public static String getRoot() {
       String root = System.getProperty("user.dir");
       String textRoot = root + File.separator + "text" + File.separator;
       return textRoot;
    }
}
