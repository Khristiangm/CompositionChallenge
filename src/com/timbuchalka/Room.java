package com.timbuchalka;

/**
 * Created by KH389659 on 28/09/2017.
 */
public class Room {
    //Fields Compostos contendo atributos de cada respectiva variavel criada, transfomar a classe em um data type perminte a variavel local acessar todos os atributos setados em ROOM..
    private Bed theBed;
    private TV theTv;
    private Wardrobe wardrobe;

    public Room(Bed theBed, TV theTv, Wardrobe wardrobe) {
        this.theBed = theBed;
        this.theTv = theTv;
        this.wardrobe = wardrobe;
    }


    public Bed getTheBed() {
        return theBed;
    }

    public TV getTheTv() {
        return theTv;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }
}
