package com.example.hw12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ChangePeople(View v){
        ImageView imageview = findViewById(R.id.imageView);
        imageview.setImageResource(R.drawable.i20191008003110);

    }
}
