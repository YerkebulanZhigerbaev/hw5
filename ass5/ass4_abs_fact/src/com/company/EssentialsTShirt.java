package com.company;

public class EssentialsTShirt implements TShirt {

    public EssentialsTShirt(TShirtSeries tShirtSeries){
        System.out.println("This is t-shirt sewed by Fear Of God:" + tShirtSeries);
    }

    @Override
    public void getDescription() {
        System.out.println("The classic Essentials tee shirt fit is designed with dropped shoulders " +
                "and stylized volume in the body to provide a comfortable drape.");
    }
}
