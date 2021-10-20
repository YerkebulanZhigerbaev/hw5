package com.company;

public class BornQazaqTShirt implements TShirt {

    public BornQazaqTShirt(TShirtSeries tShirtSeries){
        System.out.println("This is t-shirt sewed by QR: " + tShirtSeries);
    }

    @Override
    public void getDescription() {
        System.out.println("Modern national identity\n" +
                "Everyone's favorite, #musthave prints! Choose yours and order\n" +
                "Composition: 100% cotton\n" +
                "Size: 2XL\n" +
                "Packing: tube");
    }
}
