package com.example.springrecipieswebappnew.Utils;

public class UppercaseLetter {
    public static String capitalizeFirstLetter(String str) {
        // Если строка пустая, вернуть без изменений
        if (str.isEmpty()) {
            return str;
        }

        char firstChar = str.charAt(0);
        char upperCaseFirstChar = Character.toUpperCase(firstChar); // Делает первый символ строки заглавным

        return upperCaseFirstChar + str.substring(1);
    }
}
