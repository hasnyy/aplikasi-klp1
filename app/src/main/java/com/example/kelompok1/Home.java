package com.example.kelompok1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ImageView btnTambah = findViewById(R.id.btnTambah);
        btnTambah.setOnClickListener(v -> {
            startActivity(new Intent(this, MainActivity.class));
        });


        GridView gridview=findViewById(R.id.gridCatatan);

        List<ModelCatatan> modelcatatan=new ArrayList<>();
        modelcatatan.add(new ModelCatatan("Catatn1","nama saya hasni","29/12/2024"));
        modelcatatan.add(new ModelCatatan("Catatn2","nama saya fila","29/12/2024"));
        modelcatatan.add(new ModelCatatan("Catatn3","nama saya asya","29/12/2024"));
        modelcatatan.add(new ModelCatatan("Catatn4","nama saya abu","29/12/2024"));
        modelcatatan.add(new ModelCatatan("Catatn5","nama saya anto","29/12/2024"));
        modelcatatan.add(new ModelCatatan("Catatn6","nama saya labibi","29/12/2024"));
        modelcatatan.add(new ModelCatatan("Catatn7","nama saya alfi","29/12/2024"));
        Adapter adapter=new Adapter(this, modelcatatan);
        gridview.setAdapter(adapter);
    }
}