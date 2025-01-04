package com.example.shinyspokat;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

public class hubungikami extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hubungikami);

        Button btnwa = findViewById(R.id.btnwa);
        btnwa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "Halo, saya ingin menanyakan harga cuci sepatu dan waktu pengerjaannya. Terima kasih!";
                sendWhatsAppMessage(message);
            }
        });
    }
    private void sendWhatsAppMessage(String message) {
        String phoneNumber = "6285814722480"; // Ganti dengan nomor telepon yang ingin Anda kirim pesan
        if (message != null && !message.isEmpty()) {
            String url = "https://api.whatsapp.com/send?phone=" + phoneNumber + "&text=" + Uri.encode(message);
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        } else {
            Toast.makeText(this, "Pesan tidak boleh kosong", Toast.LENGTH_SHORT).show();
        }
    }
    }





