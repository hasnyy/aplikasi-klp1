package com.example.kelompok1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TambahActivity extends AppCompatActivity {
    private String background;
    ModelCatatan modelcatatan;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampilan_isi_catatan);

        EditText judul = findViewById(R.id.Judul);
        EditText isi = findViewById(R.id.isiCatatan);
        TextView tanggal = findViewById(R.id.Tanggal);
        ImageView btnBack = findViewById(R.id.btnBack);
        ImageView simpan= findViewById(R.id.simpan);

        ImageView warna1 = findViewById(R.id.warna1);
        ImageView warna2 = findViewById(R.id.warna2);
        ImageView warna3 = findViewById(R.id.warna3);
        ImageView warna4 = findViewById(R.id.warna4);
        ImageView warna5 = findViewById(R.id.warna5);

        warna1.setOnClickListener(v -> {
            Toast.makeText(this, "Warna 1 dipilih", Toast.LENGTH_SHORT).show();
            warna1.setImageResource(R.drawable.done);
            warna2.setImageResource(0);
            warna3.setImageResource(0);
            warna4.setImageResource(0);
            warna5.setImageResource(0);
            background = "warna1";

        });

        warna2.setOnClickListener(v -> {
            Toast.makeText(this, "Warna 2 dipilih", Toast.LENGTH_SHORT).show();
            warna1.setImageResource(0);
            warna2.setImageResource(R.drawable.done);
            warna3.setImageResource(0);
            warna4.setImageResource(0);
            warna5.setImageResource(0);
            background = "warna2";
        });

        warna3.setOnClickListener(v -> {
            Toast.makeText(this, "Warna 3 dipilih", Toast.LENGTH_SHORT).show();
            warna1.setImageResource(0);
            warna2.setImageResource(0);
            warna3.setImageResource(R.drawable.done);
            warna4.setImageResource(0);
            warna5.setImageResource(0);
            background = "warna3";
        });

        warna4.setOnClickListener(v -> {
            Toast.makeText(this, "Warna 4 dipilih", Toast.LENGTH_SHORT).show();
            warna1.setImageResource(0);
            warna2.setImageResource(0);
            warna3.setImageResource(0);
            warna4.setImageResource(R.drawable.done);
            warna5.setImageResource(0);
            background  = "warna4";
        });


        warna5.setOnClickListener(v -> {
            Toast.makeText(this, "Warna 5 dipilih", Toast.LENGTH_SHORT).show();
            warna1.setImageResource(0);
            warna2.setImageResource(0);
            warna3.setImageResource(0);
            warna4.setImageResource(0);
            warna5.setImageResource(R.drawable.done);
            background = "warna5";
        });

        LocalDate date = null;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            date = LocalDate.now();
        }

        DateTimeFormatter format = null;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            format = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        }

        String tgl;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            tgl = date.format(format);
        }else {
            tgl = null;
        }

        LocalDateTime time = null;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            time = LocalDateTime.now();
        }
        int jam, menit;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            jam = time.getHour();
        }else{
            jam = 0;
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            menit = time.getMinute();
        }else{
            menit = 0;
        }

        tanggal.setText(tgl);

        btnBack.setOnClickListener(v -> {
            finish();
        });

        simpan.setOnClickListener(v -> {
            String jdl = judul.getText().toString();
            String is = isi.getText().toString();
            if(jdl.isEmpty()){
                jdl = "Belum Ada Judul";
            }
            if(is.isEmpty()){
                is = "Belum Ada Isi";
            }
                modelcatatan = new ModelCatatan(jdl,is,tgl,background,jam+":"+menit);
            Home.data = modelcatatan;
            Home.isSimpan = true;
            finish();
        });
    }
}