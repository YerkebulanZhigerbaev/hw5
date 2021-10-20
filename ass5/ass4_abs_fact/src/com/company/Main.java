package com.company;

public class Main {

    public static void main(String[] args) {
	ClothesFactory qazaqRepublicClothesFactory = new QazaqRepublicClothesFactory();

    Hoodie barijaqsybolady = qazaqRepublicClothesFactory.sewHoodie(Hoodie.HoodieSeries.ModernIdentity);
    barijaqsybolady.getDescription();

    System.out.println("-------------------------------------------------------------------");

    TShirt bornqazaq = qazaqRepublicClothesFactory.sewTShirt(TShirt.TShirtSeries.UNION);
    bornqazaq.getDescription();
    }
}
