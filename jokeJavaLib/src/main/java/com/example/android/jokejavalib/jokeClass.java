package com.example.android.jokejavalib;

import java.util.Random;

public class jokeClass {
    private String[] jokes;
    private Random random = new Random();
    public jokeClass(){
        jokes = new String[5];
        jokes[0] = "There are three kinds of lies: Lies, damned lies, and benchmarks.";
        jokes[1] = "I just saw my life flash before my eyes and all I could see was a close tag…";
        jokes[2] = "Debugging: Removing the needles from the haystack.";
        jokes[3] = "The computer is mightier than the pen, the sword, and usually, the programmer.";
        jokes[4] = "All programmers are playwrights, and all computers are lousy actors.";
    }
    public String getJoke(){
        int randomIndex = random.nextInt(jokes.length);
        return jokes[randomIndex];
    }
}
