package ru.javarush.cryptoanalyzer.efremov.constants;

public class Strings {
    private static final String rus="йцукенгшщзхъфывапролджэячсмитьбюё";
    private static final String eng="qwertyuiopasdfghjklzxcvbnm";
    private static final String numbers = "1234567890";
    private static final String symbols = "[]';.,/?+=-_)(*&^%$#@!";

    public static final String alphabet = rus+rus.toUpperCase()+eng+eng.toUpperCase()+numbers+symbols;
}
