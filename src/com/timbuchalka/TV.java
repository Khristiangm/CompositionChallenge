package com.timbuchalka;

/**
 * Created by KH389659 on 28/09/2017.
 */
public class TV {

    private String model;
    private String manufacturer;
    private int inches;

    public TV(String model, String manufacturer, int inches) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.inches = inches;
    }
    //Metodo Criado para printar os Fields no Main
    public void propertiesTv() {

        System.out.println("The Tv Model is "
                + this.model + ", the manufacturer "
                + this.manufacturer + " and has "
                + this.inches + "º");
    }


    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getInches() {
        return inches;
    }
}
