package com.example.insemtif.adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.insemtif.AppInterface;
import com.example.insemtif.R;
import com.example.insemtif.data.Mahasiswa;
import com.example.insemtif.data.MahasiswaKP;
import com.example.insemtif.data.MahasiswaTA;

import java.util.ArrayList;

public class AdapterTA extends RecyclerView.Adapter<AdapterTA.MyViewHolder> {
    private ArrayList<MahasiswaTA> list;
    public AppInterface appInterface;
    public AdapterTA(ArrayList<MahasiswaTA> list, AppInterface appInterface) {
        this.list = list;
        this.appInterface = appInterface;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView Nama, NIDN, status;
        public Button kelola;

        public MyViewHolder(View itemView) {
            super(itemView);
            Nama = itemView.findViewById(R.id.nama);
            NIDN = itemView.findViewById(R.id.id);
            status = itemView.findViewById(R.id.status);
            kelola = itemView.findViewById(R.id.buttonKelola);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemslist, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        MahasiswaTA currentMahasiswa = list.get(position);
        holder.Nama.setText(currentMahasiswa.getNama());
        holder.NIDN.setText(currentMahasiswa.getNIDN());
        holder.status.setText(currentMahasiswa.getStatus());
        if (currentMahasiswa.getStatus().equals("Selesai")) {
            holder.status.setBackgroundColor(Color.GREEN);
        } else {
            holder.status.setBackgroundColor(Color.RED);
        }
        holder.kelola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               appInterface.onItemClicked(currentMahasiswa.getNIDN(), currentMahasiswa.getNama(), currentMahasiswa.getJudul(), currentMahasiswa.getFoto());
            }
        });
    }


}
