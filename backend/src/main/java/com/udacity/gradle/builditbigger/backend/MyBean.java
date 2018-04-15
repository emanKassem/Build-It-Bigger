package com.udacity.gradle.builditbigger.backend;

import com.example.android.jokejavalib.jokeClass;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private jokeClass jokeClass;
    public MyBean(){
        jokeClass = new jokeClass();
    }
    public String getData() {
        return jokeClass.getJoke();
    }
}