package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
//        Bed theBed = new Bed("Casal", "MaxFlex", 2, new Size(1.92, 1.92));
//        TV theTv = new TV("12354", "PANASONIC", 60);
//        Wardrobe theWardrobe = new Wardrobe("Casal 4 Portas", "Aliança Moveis", "Branco", new Dimension(3.00, 2.30, 45))


        //Instanciando o objeto Room recebendo os outros 3 objetos criados e que compoe o quarto....
        Room theRoom = new Room(new Bed("Casal", "MaxFlex", 2, new Size(1.92, 1.92)),
                new TV("12354", "PANASONIC", 60),
                new Wardrobe(" Casal 4 Portas ", " Aliança Moveis ", " Branco ", new Dimension(3.00, 2.30, 45)));


//	      theRoom.getThebed();
//        System.out.println(theRoom.getThebed());
//        theRoom.getTheTv();
//        System.out.println(theRoom.getTheTv());
//        theRoom.getWardrobe();
//        System.out.println(theRoom.getWardrobe());

        theRoom.getTheTv().propertiesTv();
        theRoom.getWardrobe().propertiesWardrobe();
        theRoom.getTheBed().propertiesBed();
//        System.out.println("The number of Pillows is: " + theRoom.getTheBed().getPillow());


    }
}
