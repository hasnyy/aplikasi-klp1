package com.example.kelompok1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity{
    ActivityResultLauncher<Intent> event;
    GridView gridview;
    List<ModelCatatan> modelcatatan;
    Adapter adapter;
    public static ModelCatatan data;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ImageView btnTambah = findViewById(R.id.btnTambah);
        btnTambah.setOnClickListener(v -> {
            event.launch(new Intent(this, TambahActivity.class));
        });

        modelcatatan=new ArrayList<>();
        gridview=findViewById(R.id.gridCatatan);
        adapter= new Adapter(this, modelcatatan);
        gridview.setAdapter(adapter);

        event = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                result->{
                    if(result.getResultCode() == RESULT_OK){
                        modelcatatan.add(data);
                        gridview.setAdapter(adapter);
                    }
                });
    }
}