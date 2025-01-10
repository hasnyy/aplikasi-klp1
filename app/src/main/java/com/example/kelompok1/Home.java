package com.example.kelompok1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class Home extends AppCompatActivity{
    GridView gridview;
    ArrayList<ModelCatatan> modelcatatan;
    Adapter adapter;
    public static boolean isSimpan = false;
    public static ModelCatatan data;
    public static int index;
    public static boolean ishapus = false;
    public static boolean isEdit = false;
    public static ModelCatatan dataEdit;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ImageView btnTambah = findViewById(R.id.btnTambah);
        btnTambah.setOnClickListener(v -> {
            startActivity(new Intent(this, TambahActivity.class));
        });

        modelcatatan=new ArrayList<>();
        gridview=findViewById(R.id.gridCatatan);
        adapter= new Adapter(this, modelcatatan);
        gridview.setAdapter(adapter);
    }

    @Override
    public void onResume(){
        super.onResume();

        if(isSimpan){
            modelcatatan.add(data);
            adapter.notifyDataSetChanged();
            isSimpan = false;
        }

        if(ishapus){
            modelcatatan.remove(index);
            adapter.notifyDataSetChanged();
            ishapus = false;
        }

        if(isEdit){
            ModelCatatan editSimpan = modelcatatan.get(index);
            editSimpan.setJudul(dataEdit.getJudul());
            editSimpan.setIsi(dataEdit.getIsi());
            editSimpan.setTanggal(dataEdit.getTanggal());
            editSimpan.setJam(dataEdit.getJam());
            editSimpan.setBackground(dataEdit.getBackground());
            adapter.notifyDataSetChanged();
            isEdit = false;
        }

    }

}