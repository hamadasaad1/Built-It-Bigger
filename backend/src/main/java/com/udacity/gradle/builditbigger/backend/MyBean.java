package com.udacity.gradle.builditbigger.backend;

import com.hamada.android.jokelibrarymodel.Jokes;

import static com.hamada.android.jokelibrarymodel.Jokes.getRandomJoke;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {
        myData = getRandomJoke();
        return myData;
    }
}
//    public void setData(String data) {
//        myData = data;
//    }
//}