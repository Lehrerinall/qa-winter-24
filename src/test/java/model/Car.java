package model;

public class Car {
    private String marka;
    private String price;
    private String colour;
    private String enginCapacity;
    private String howManyKilometersDoesTheCarRun;

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getEnginCapacity() {
        return enginCapacity;
    }

    public void setEnginCapacity(String enginCapacity) {
        this.enginCapacity = enginCapacity;
    }

    public String getHowManyKilometersDoesTheCarRun() {
        return howManyKilometersDoesTheCarRun;
    }

    public void setHowManyKilometersDoesTheCarRun(String howManyKilometersDoesTheCarRun) {
        this.howManyKilometersDoesTheCarRun = howManyKilometersDoesTheCarRun;
    }
}
