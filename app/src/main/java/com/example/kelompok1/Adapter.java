package com.example.kelompok1;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;

public class Adapter extends BaseAdapter {
    private Context context;
    private ArrayList<ModelCatatan> catatan;

    public Adapter(Context context, ArrayList<ModelCatatan> catatan){
        this.context=context;
        this.catatan=catatan;
    }

    @Override
    public int getCount() {
        return catatan.size();
    }

    @Override
    public Object getItem(int position) {
        return catatan.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.model_item_catatan,parent,false);
        }

        ModelCatatan catatans=catatan.get(position);
        TextView judul=convertView.findViewById(R.id.judul);
        TextView isicatatan=convertView.findViewById(R.id.isicatatan);
        TextView tanggal=convertView.findViewById(R.id.tanggal);
        TextView jam = convertView.findViewById(R.id.jam);
        RelativeLayout background=convertView.findViewById(R.id.background);
        judul.setText(catatans.getJudul());
        isicatatan.setText(catatans.getIsi());
        tanggal.setText(catatans.getTanggal());
        jam.setText(catatans.getJam());
        String bg = catatans.getBackground();

        if("warna1".equals(bg)){
            background.setBackgroundResource(R.drawable.warna1);
        }else if("warna2".equals(bg)){
            background.setBackgroundResource(R.drawable.warna2);
        }else if("warna3".equals(bg)){
            background.setBackgroundResource(R.drawable.warna3);
        }else if("warna4".equals(bg)){
            background.setBackgroundResource(R.drawable.warna4);
        }else if("warna5".equals(bg)){
            background.setBackgroundResource(R.drawable.warna5);
        }else{
            background.setBackgroundResource(R.drawable.warna6);
        }

        convertView.setOnClickListener(v -> {
            Intent intent = new Intent(context,EditActivity.class);
            intent.putExtra("index",position);
            intent.putExtra("judul",catatans.getJudul());
            intent.putExtra("isi",catatans.getIsi());
            intent.putExtra("tanggal",catatans.getTanggal());
            intent.putExtra("jam",catatans.getJam());
            intent.putExtra("bg",bg);
            context.startActivity(intent);
        });

        return convertView;
    }
}