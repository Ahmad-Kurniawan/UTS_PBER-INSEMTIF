package com.example.insemtif.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.insemtif.R;
import com.example.insemtif.data.JadwalSeminar;

import java.util.ArrayList;

public class AdapterJadwal extends RecyclerView.Adapter<AdapterJadwal.MyViewHolder> {
    private ArrayList<JadwalSeminar> list;
    public AdapterJadwal(ArrayList<JadwalSeminar> list) {
        this.list = list;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView waktu, tempat, keterangan;
        public Button kelola;

        public MyViewHolder(View itemView) {
            super(itemView);
            waktu = itemView.findViewById(R.id.waktu);
            tempat = itemView.findViewById(R.id.tempat);
            keterangan = itemView.findViewById(R.id.keterangan);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemtable, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        JadwalSeminar jadwal = list.get(position);
        holder.waktu.setText(jadwal.getWaktu());
        holder.tempat.setText(jadwal.getTempat());
        holder.keterangan.setText(jadwal.getKeterangan());
    }


}
