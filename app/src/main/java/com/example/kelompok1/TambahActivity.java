package com.example.kelompok1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class TambahActivity extends AppCompatActivity {
    private String background;
    ModelCatatan modelcatatan; //deklarasi model

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampilan_isi_catatan);

        ImageView btnBack = findViewById(R.id.btnBack);

        btnBack.setOnClickListener(v -> {
            finish();
        });

        EditText judul = findViewById(R.id.Judul);
        EditText isi = findViewById(R.id.isiCatatan);
        TextView tanggal = findViewById(R.id.Tanggal);
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
            background = "#D0E8C5";

        });

        warna2.setOnClickListener(v -> {
            Toast.makeText(this, "Warna 2 dipilih", Toast.LENGTH_SHORT).show();
            warna1.setImageResource(0);
            warna2.setImageResource(R.drawable.done);
            warna3.setImageResource(0);
            warna4.setImageResource(0);
            warna5.setImageResource(0);
            background = "#BFECFF";
        });

        warna3.setOnClickListener(v -> {
            Toast.makeText(this, "Warna 3 dipilih", Toast.LENGTH_SHORT).show();
            warna1.setImageResource(0);
            warna2.setImageResource(0);
            warna3.setImageResource(R.drawable.done);
            warna4.setImageResource(0);
            warna5.setImageResource(0);
            background = "#CDC1FF";
        });

        warna4.setOnClickListener(v -> {
            Toast.makeText(this, "Warna 4 dipilih", Toast.LENGTH_SHORT).show();
            warna1.setImageResource(0);
            warna2.setImageResource(0);
            warna3.setImageResource(0);
            warna4.setImageResource(R.drawable.done);
            warna5.setImageResource(0);
            background  = "#FFF6E3";
        });


        warna5.setOnClickListener(v -> {
            Toast.makeText(this, "Warna 5 dipilih", Toast.LENGTH_SHORT).show();
            warna1.setImageResource(0);
            warna2.setImageResource(0);
            warna3.setImageResource(0);
            warna4.setImageResource(0);
            warna5.setImageResource(R.drawable.done);
            background = "#FFCCEA";
        });

        simpan.setOnClickListener(v -> {
            String jdl = judul.getText().toString();
            String is = isi.getText().toString();
            String tgl = tanggal.getText().toString();
            modelcatatan = new ModelCatatan(jdl,is,tgl,background); //Inisialisasi dan pemberian nilai ke varibake model catatan
            Home.data = modelcatatan; //Pemberian nilai ke varibel static data pada class Home
            setResult(RESULT_OK); //Mengirimkan kode result ke activity Home
            finish();
        });
    }
}