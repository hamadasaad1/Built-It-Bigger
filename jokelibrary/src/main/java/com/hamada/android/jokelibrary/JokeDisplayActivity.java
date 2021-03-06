package com.hamada.android.jokelibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);

        Intent intent=getIntent();
        if (intent != null&&intent.hasExtra("jokes")) {
            String joke = getIntent().getStringExtra("jokes");
            TextView jokeText = findViewById(R.id.joke_display_textView);
            jokeText.setText(joke);
        }
    }
}
