package com.company;

public class FearOfGodClothesFactory implements ClothesFactory {

    @Override
    public Hoodie sewHoodie(Hoodie.HoodieSeries hoodieSeries) {
        return new BlessedHoodie(hoodieSeries);
    }

    @Override
    public TShirt sewTShirt(TShirt.TShirtSeries tShirtSeries) {
        return new EssentialsTShirt(tShirtSeries);
    }
}
