package ucu.edu.apps.flowerstore.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ucu.edu.apps.flowerstore.Flower;
import ucu.edu.apps.flowerstore.FlowerColor;

@RestController
@RequestMapping("/api/flowers")
public class FlowerController {
    @GetMapping("/list")
    public List<Flower> getFlowers() {
        return List.of(new Flower(5, 0.8, FlowerColor.RED));
    }
}
