package com.timbuchalka;

import java.awt.*;

/**
 * Created by KH389659 on 28/09/2017.
 */
public class Wardrobe {

    private String model;
    private String manufacturer;
    private String color;
    private Dimension wardrobeSize;

    public Wardrobe(String model, String manufacturer, String color, Dimension wardrobeSize) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.color = color;
        this.wardrobeSize = wardrobeSize;
    }
    //Metodo Criado para printar os Fields no Main
    public void propertiesWardrobe() {
        System.out.println("The Wardrobe model is " + this.model +
                " Manufacturer is " + this.manufacturer +
                " Your Color ir " + this.color +
                " And Finally your size is " + this.wardrobeSize.getWidth() + "x" + this.wardrobeSize.getHeight() + "x" + this.wardrobeSize.getDepth());
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getColor() {
        return color;
    }

    public Dimension getWardrobeSize() {
        return wardrobeSize;
    }
}
