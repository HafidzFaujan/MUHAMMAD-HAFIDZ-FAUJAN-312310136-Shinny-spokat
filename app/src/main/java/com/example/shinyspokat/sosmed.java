package com.example.shinyspokat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class sosmed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sosmed);

        ImageView btntt = findViewById(R.id.btntt);
        ImageView btnfb = findViewById(R.id.btnfb);
        ImageView btnig = findViewById(R.id.btnig);

        // Set OnClickListener untuk TikTok
        btntt.setOnClickListener(v -> openTikTokProfile("https://www.tiktok.com/@shinnyspokat"));

        // Set OnClickListener untuk Facebook
        btnfb.setOnClickListener(v -> openFacebookProfile("https://www.facebook.com/hafidz.faujan"));

        // Set OnClickListener untuk Instagram
        btnig.setOnClickListener(v -> openInstagramProfile("https://www.instagram.com/apischillguy"));
    }

    private void openTikTokProfile(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    private void openFacebookProfile(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    private void openInstagramProfile(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}