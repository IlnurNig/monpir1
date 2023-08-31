package ru.monpir.documentationRd.model;

public enum Stamp {
    TX("Технология производства"),
    AC("Архитектурно-строительные решения"),
    CM("Сметная документация");

    private final String name;

    Stamp(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
