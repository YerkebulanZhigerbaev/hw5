package com.company;

public class BariJaqsyBoladyHoodie implements Hoodie {

    public BariJaqsyBoladyHoodie(HoodieSeries hoodieSeries){
        System.out.println("This is hoodie made by Qazaq Republic - " + hoodieSeries);
    }

    @Override
    public void getDescription() {
        System.out.println("Modern national identity " +
                "All favorite, #musthave prints! " +
                "Choose yours and order. " +
                "Composition: 100% cotton Size: M");
    }
}
