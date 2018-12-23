package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;
import java.util.concurrent.TimeUnit;
import timber.log.Timber;
import static junit.framework.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class AsyncTask {


    private Context context;

    @Test
    public void testResult(){
        String joke=null;
        JokeAsyncTask jokeAsyncTask=new JokeAsyncTask(context);
        try {

            joke=jokeAsyncTask.get(30,TimeUnit.SECONDS);
            assertNotNull(joke);
            Timber.d("NonEmpty Joke" + joke);
        }catch (Exception e){

            Timber.e("error" + e.getStackTrace());
        }
    }
}
