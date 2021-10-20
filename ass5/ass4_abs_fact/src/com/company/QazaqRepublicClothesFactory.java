package com.company;

public class QazaqRepublicClothesFactory implements ClothesFactory {

    @Override
    public Hoodie sewHoodie(Hoodie.HoodieSeries hoodieSeries) {
        return new BariJaqsyBoladyHoodie(hoodieSeries);
    }

    @Override
    public TShirt sewTShirt(TShirt.TShirtSeries tShirtSeries) {
        return new BornQazaqTShirt(tShirtSeries);
    }
}
