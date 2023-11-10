package ucu.edu.apps.flowerstore;

import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Flower {
    @Getter
    private double sepalLength;
    @Getter
    private double price;
    @Getter
    private FlowerColor text;
}