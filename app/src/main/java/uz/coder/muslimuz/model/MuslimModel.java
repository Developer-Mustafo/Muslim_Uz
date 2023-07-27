package uz.coder.muslimuz.model;

import java.io.Serializable;

public class MuslimModel implements Serializable {
    private String name;
    private String time;
    private String menu;

    public MuslimModel(String name, String time) {
        this.name = name;
        this.time = time;
    }

    public MuslimModel(String name, String time, String menu) {
        this.name = name;
        this.time = time;
        this.menu = menu;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
