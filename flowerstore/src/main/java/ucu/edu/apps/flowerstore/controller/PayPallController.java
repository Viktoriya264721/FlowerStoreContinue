package ucu.edu.apps.flowerstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pay")
public class PayPallController {
    @GetMapping("/pall")
    public String getPayPall() {
        return "Great idea to use PayPall! =)";
    }
}
