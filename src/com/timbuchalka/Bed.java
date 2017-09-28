package com.timbuchalka;

/**
 * Created by KH389659 on 28/09/2017.
 */
public class Bed {

    private String model;
    private String manufacturer;
    private int pillow;
    private Size bedSize;

    public Bed(String model, String manufacturer, int pillow, Size bedSize) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.pillow = pillow;
        this.bedSize = bedSize;
    }
    //Metodo Criado para printar os Fields no Main
    public void propertiesBed() {

        System.out.println("The Model of this Bed is "
                + this.model + " Your Manufacturer is "
                + this.manufacturer + " The number of pyllows purchased was " + this.pillow
                + " The bed size is " + this.bedSize.getHeight() + "X" + this.bedSize.getWidht());
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPillow() {
        return pillow;
    }

    public Size getBedSize() {
        return bedSize;
    }
}
