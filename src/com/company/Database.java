package com.company;

public class Database {
    private int number;
    private static Database[] objects = new Database[5];

    private Database(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "[DATABASE OBJECT NUMBER] "+this.number;
    }

    public static Database Create(int number) {
        int index = number % 5;

        if (objects[index] == null) {
            System.out.println("[-------NEW OBJECT CREATED-------]");
            objects[index] = new Database(index);
        }

        return objects[index];
    }
}
