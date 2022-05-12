package com.company;

import java.util.Date;

public class Memento {
    private final String version;
    private final Date data;

    public Memento(String version, Date data) {
        this.version = version;
        this.data = data;
    }

    public String getVersion() {
        return version;
    }

    public Date getData() {
        return data;
    }
}

