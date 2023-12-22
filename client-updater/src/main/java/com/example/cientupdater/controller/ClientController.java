package com.example.cientupdater.controller;

import com.example.cientupdater.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/client")
@AllArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @GetMapping("/test")
    public String balancerTest() {
        return clientService.test();
    }
}