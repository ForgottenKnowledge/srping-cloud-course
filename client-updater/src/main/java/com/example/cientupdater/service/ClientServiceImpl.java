package com.example.cientupdater.service;

import com.example.cientupdater.connector.ClientServiceConnector;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements ClientService{

    private final ClientServiceConnector clientServiceConnector;

    @Override
    public String test() {
        return clientServiceConnector.test();
    }
}
