package com.example.messaging_app.uc3_toshow_hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController_Path {

    // Endpoint to return "Hello from BridgeLabz"
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    // Endpoint to return "Hello [name] from BridgeLabz"
    @GetMapping("/query")
    public String sayHelloWithName(@RequestParam(defaultValue = "Hritik") String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}
