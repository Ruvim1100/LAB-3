package com.company;
import java.util.Date;

public class Project {

    private String version;
    private Date data;

    public void setVersionDate(String version){
        this.version = version;
        this.data = new Date();
    }

    public Memento save(){
        return new Memento(version, data);
    }

    public void load(Memento memento){
        version = memento.getVersion();
        data = memento.getData();
    }

    @Override
    public String toString() {
        return "\n Project:" +
                "\nVersion: " + version +
                "\nData: " + data + "\n";
    }

}
