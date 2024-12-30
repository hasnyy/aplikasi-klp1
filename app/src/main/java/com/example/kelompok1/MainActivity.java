package com.example.kelompok1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.atomic.AtomicReference;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampilan_isi_catatan);

        ImageView btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> {
            finish();
        });


        ImageView warna1 = findViewById(R.id.warna1);
        ImageView warna2 = findViewById(R.id.warna2);
        ImageView warna3 = findViewById(R.id.warna3);
        ImageView warna4 = findViewById(R.id.warna4);
        ImageView warna5 = findViewById(R.id.warna5);
        AtomicReference<String> background = new AtomicReference<>("");

        warna1.setOnClickListener(v -> {
            Toast.makeText(this, "Warna 1 dipilih", Toast.LENGTH_SHORT).show();
            warna1.setImageResource(R.drawable.done);
            warna2.setImageResource(0);
            warna3.setImageResource(0);
            warna4.setImageResource(0);
            warna5.setImageResource(0);
            background.set("#D0E8C5");
        });


        warna2.setOnClickListener(v -> {
            Toast.makeText(this, "Warna 2 dipilih", Toast.LENGTH_SHORT).show();
            warna1.setImageResource(0);
            warna2.setImageResource(R.drawable.done);
            warna3.setImageResource(0);
            warna4.setImageResource(0);
            warna5.setImageResource(0);
            background.set("#BFECFF");
        });


        warna3.setOnClickListener(v -> {
            Toast.makeText(this, "Warna 3 dipilih", Toast.LENGTH_SHORT).show();
            warna1.setImageResource(0);
            warna2.setImageResource(0);
            warna3.setImageResource(R.drawable.done);
            warna4.setImageResource(0);
            warna5.setImageResource(0);
            background.set("#CDC1FF");
        });


        warna4.setOnClickListener(v -> {
            Toast.makeText(this, "Warna 4 dipilih", Toast.LENGTH_SHORT).show();
            warna1.setImageResource(0);
            warna2.setImageResource(0);
            warna3.setImageResource(0);
            warna4.setImageResource(R.drawable.done);
            warna5.setImageResource(0);
            background.set("#FFF6E3");
        });


        warna5.setOnClickListener(v -> {
            Toast.makeText(this, "Warna 5 dipilih", Toast.LENGTH_SHORT).show();
            warna1.setImageResource(0);
            warna2.setImageResource(0);
            warna3.setImageResource(0);
            warna4.setImageResource(0);
            warna5.setImageResource(R.drawable.done);
            background.set("#FFCCEA");
        });
    }
}