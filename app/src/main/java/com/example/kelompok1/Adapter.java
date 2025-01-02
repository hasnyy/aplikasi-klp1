package com.example.kelompok1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;

public class Adapter extends BaseAdapter {
    private Context context;
    private List<ModelCatatan> catatan;

    public Adapter(Context context, List<ModelCatatan> catatan){
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

        judul.setText(catatans.getJudul());
        isicatatan.setText(catatans.getIsi());
        tanggal.setText(catatans.getTanggal());
        return convertView;
    }
}