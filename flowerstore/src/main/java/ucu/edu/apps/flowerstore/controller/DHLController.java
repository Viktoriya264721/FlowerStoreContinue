package ucu.edu.apps.flowerstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dhl")
public class DHLController {
    @GetMapping("/contr")
    public String getDHL() {
        return "You are also a millionaire!";
    }
}