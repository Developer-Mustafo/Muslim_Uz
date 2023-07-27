package uz.coder.muslimuz.model;

public class NamozModel {
    private int img;
    private String name;
    private String ozi;

    public NamozModel(int img, String name, String ozi) {
        this.img = img;
        this.name = name;
        this.ozi = ozi;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOzi() {
        return ozi;
    }

    public void setOzi(String ozi) {
        this.ozi = ozi;
    }
}
