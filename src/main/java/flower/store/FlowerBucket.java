package flower.store;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Item{
    List<FlowerPack> flowerPacks = new ArrayList<>();

    public double getPrice(){
        double price = 0;
        for (FlowerPack flowerPack : flowerPacks){
            price +=  flowerPack.getPrice();
        }
        return price;
    }

    public void add(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);

    }
}