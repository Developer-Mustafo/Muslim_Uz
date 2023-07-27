package uz.coder.muslimuz.model;

public class AllohIsmlariModel {
    private int img;
    private String name;
    private String quality;

    public AllohIsmlariModel(int img, String name, String quality) {
        this.img = img;
        this.name = name;
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
