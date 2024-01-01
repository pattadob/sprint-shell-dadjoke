package com.example.dadjoke.commands;

import com.example.dadjoke.client.DadJokeClient;
import com.example.dadjoke.model.DadJokeResponse;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class DadJokeCommand {

    private final DadJokeClient dadJokeClient;

    public DadJokeCommand(DadJokeClient dadJokeClient) {
        this.dadJokeClient = dadJokeClient;
    }

    @ShellMethod(key = "random", value = "I will return a random fantastic dad joke")
    public String getRandomDadJoke(){
        DadJokeResponse response = dadJokeClient.random();
        return response.joke();
    }
}
