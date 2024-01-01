package com.example.dadjoke.client;

import com.example.dadjoke.model.DadJokeResponse;
import org.springframework.web.service.annotation.GetExchange;

public interface DadJokeClient {

    @GetExchange("/")
    DadJokeResponse random();
}
