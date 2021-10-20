package com.company;

public interface ClothesFactory {

    Hoodie sewHoodie(Hoodie.HoodieSeries hoodieSeries);

    TShirt sewTShirt(TShirt.TShirtSeries tShirtSeries);
}
