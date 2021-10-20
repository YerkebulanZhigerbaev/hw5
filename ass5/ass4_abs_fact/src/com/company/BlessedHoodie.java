package com.company;

public class BlessedHoodie implements Hoodie {

    public BlessedHoodie(HoodieSeries hoodieSeries){
        System.out.println("This is the hoodie sewed by Fear Of God -" + hoodieSeries);
    }

    @Override
    public void getDescription() {
        System.out.println("A Union x Fear of God reflective logo is on the chest. " +
                "An Essentials logo is across the center back and an " +
                "Essentials rubberized label is placed on the back.");
    }
}
