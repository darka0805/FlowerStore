package flower.store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.ToString;

// @Getter @AllArgsConstructor @ToString @NoArgsConstructor
// public class Flower{
//     private FlowerType flowerType;
//     private double price;
//     private double sepalLength;
//     private FlowerColor color;

//     public Flower(Flower flower){
//         this.flowerType = flower.flowerType;
//         this.price = flower.price;
//         this.sepalLength = flower.sepalLength;
//         this.color = flower.color;
//     }
//     // public String getColor() {
//     //     return color.toString();
//     // }
// }
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public Flower(Flower flower){
        this.flowerType = flower.flowerType;
        this.price = flower.price;
        this.sepalLength = flower.sepalLength;
        this.color = flower.color;
    }

    public String getColor() {
        return color.toString();
    }
}
