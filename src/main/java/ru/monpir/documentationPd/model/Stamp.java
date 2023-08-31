package ru.monpir.documentationPd.model;

public enum Stamp {
    POS("Проект организации строительства"),
    PZ("Пояснительная записка");

    private final String name;

    Stamp(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
