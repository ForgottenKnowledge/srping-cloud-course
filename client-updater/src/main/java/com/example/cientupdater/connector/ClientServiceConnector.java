package com.example.cientupdater.connector;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@FeignClient(name = "CLIENT-SERVICE", fallbackFactory = ClientServiceConnector.ClientServiceConnectorFallbackFactory.class)
public interface ClientServiceConnector {

    @GetMapping("/api/client/test")
    String test();

    @Component
    class ClientServiceConnectorFallbackFactory implements FallbackFactory<FallbackWithFactory> {

        @Override
        public FallbackWithFactory create(Throwable cause) {
            return new FallbackWithFactory(cause.getMessage());
        }
    }

    @Slf4j
    record FallbackWithFactory(String reason) implements ClientServiceConnector {

        @Override
        public String test() {
            return "Отработал Fallback";
        }
    }
}