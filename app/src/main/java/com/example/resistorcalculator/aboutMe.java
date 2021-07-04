package com.example.resistorcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class aboutMe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
    }

    public void instagramClick(View view) {
        Uri uri = Uri.parse("https://instagram.com/zahirulnahid"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void githubClick(View view) {
        Uri uri = Uri.parse("https://github.com/zahirulnahid"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void facebookClick(View view) {
        Uri uri = Uri.parse("https://facebook.com/nahid34c"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void linkedinClick(View view) {
        Uri uri = Uri.parse("https://www.linkedin.com/in/md-zahirul-islam-nahid-3344a9194/"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void youtubeClick(View view) {
        Uri uri = Uri.parse("https://youtube.com/zahirulislamnahid"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}