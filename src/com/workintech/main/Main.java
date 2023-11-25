package com.workintech.main;

import com.workintech.enums.LampType;
import com.workintech.enums.PaintColor;
import com.workintech.model.*;

public class Main {
    public static void main(String[] args) {
        Ceiling ceiling = new Ceiling(3, PaintColor.GREEN);
        ceiling.create();

        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");

        Bedroom bedroom = new Bedroom("Oturma", wall1, wall2, wall3 , wall4 , ceiling , new Bed("double" , 2,2,2, 2),
                new Lamp(LampType.Lighter ,true ,45) ,new Wardrobe(2,4,6), new Carpet(3,2,PaintColor.WHITE));
        System.out.println(bedroom);

    }
}