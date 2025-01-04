package com.example.kelompok1;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EditActivity extends AppCompatActivity {

    private String background;
    ModelCatatan modelcatatan;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);



        ImageView btnBack = findViewById(R.id.btnBackEdit);

        btnBack.setOnClickListener(v -> {
            finish();
        });

        EditText judul = findViewById(R.id.JudulEdit);
        EditText isi = findViewById(R.id.isiCatatanEdit);
        TextView tanggal = findViewById(R.id.TanggalEdit);
        ImageView simpan= findViewById(R.id.simpanEdit);

        judul.setText(getIntent().getStringExtra("judul"));
        isi.setText(getIntent().getStringExtra("isi"));
        tanggal.setText(getIntent().getStringExtra("tanggal"));

        ImageView warna1 = findViewById(R.id.warna1);
        ImageView warna2 = findViewById(R.id.warna2);
        ImageView warna3 = findViewById(R.id.warna3);
        ImageView warna4 = findViewById(R.id.warna4);
        ImageView warna5 = findViewById(R.id.warna5);

        String bgedit = getIntent().getStringExtra("bg");
        if("warna1".equals(bgedit)){
            warna1.setImageResource(R.drawable.done);
        } else if ("warna2".equals(bgedit)) {
            warna2.setImageResource(R.drawable.done);
        } else if ("warna3".equals(bgedit)) {
            warna3.setImageResource(R.drawable.done);
        } else if ("warna4".equals(bgedit)) {
            warna4.setImageResource(R.drawable.done);
        }  else if ("warna5".equals(bgedit)) {
            warna5.setImageResource(R.drawable.done);
        }




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
    }
}