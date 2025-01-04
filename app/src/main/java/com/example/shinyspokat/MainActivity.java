package com.example.shinyspokat;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.MovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.shinyspokat.databinding.ActivityMainBinding;

import org.w3c.dom.Text;
import java.security.PublicKey;


public class MainActivity extends AppCompatActivity {

    public Button listharga;
    public Button hubungikami;
    public Button lokasi;
    public Button sosmed;
    public Button tentangkami;
    public Button btnwa;

    private ActivityMainBinding binding;



        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);




            lokasi = findViewById(R.id.lokasi);
            lokasi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, lokasi.class);
                    startActivity(intent);
                }
            });

            hubungikami = findViewById(R.id.hubungikami);
            hubungikami.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, hubungikami.class);
                    startActivity(intent);
                }
            });


            listharga = findViewById(R.id.list);
            listharga.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, listharga.class);
                    startActivity(intent);
                }
            });

            sosmed = findViewById(R.id.sosialmedia);
            sosmed.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, sosmed.class);
                    startActivity(intent);
                }
            });

            tentangkami = findViewById(R.id.tentangkami);
            tentangkami.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, tentangkami.class);
                    startActivity(intent);
                }
            });
        }
    }





