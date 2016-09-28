package com.example.android.resume;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView intro = (TextView) findViewById(R.id.intro);
        intro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, Intro.class);
                startActivity(numbersIntent);
            }
        });
        TextView skills = (TextView) findViewById(R.id.skill);
        skills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, Skill.class);
                startActivity(numbersIntent);
            }
        });
        TextView ach = (TextView) findViewById(R.id.achievements);
        ach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, Achievement.class);
                startActivity(numbersIntent);
            }
        });
        TextView gor = (TextView) findViewById(R.id.gorge);
        gor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, Gorge.class);
                startActivity(numbersIntent);
            }
        });
        TextView expe = (TextView) findViewById(R.id.experience);
        expe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent numbersIntent = new Intent(MainActivity.this, Experience.class);
                startActivity(numbersIntent);
            }
        });
        TextView dre = (TextView) findViewById(R.id.dream);
        dre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, Dream.class);
                startActivity(numbersIntent);
            }
        });

    }

}
