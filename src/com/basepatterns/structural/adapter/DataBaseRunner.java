package com.basepatterns.structural.adapter;

public class DataBaseRunner {
    public static void main(String[] args) {
        DataBase dataBase = new AdapterJavaToDataBase();

        dataBase.insert();
        dataBase.update();
        dataBase.select();
        dataBase.remove();
    }
}
