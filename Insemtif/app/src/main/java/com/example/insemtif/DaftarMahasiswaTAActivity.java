package com.example.insemtif;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.insemtif.adapter.AdapterKP;
import com.example.insemtif.adapter.AdapterTA;
import com.example.insemtif.data.Constants;
import com.example.insemtif.data.MahasiswaTA;

import java.util.ArrayList;

public class DaftarMahasiswaTAActivity extends AppCompatActivity implements AppInterface {

    private RecyclerView recyclerView;
    private AdapterTA adapter;
    private ArrayList<MahasiswaTA> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_mahasiswa_taactivity);

        recyclerView = findViewById(R.id.rvlist);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        dataList = Constants.getMahasiswaTAData();
        adapter = new AdapterTA(dataList,this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClicked(String NIDN, String nama, String judul, int foto) {
        Intent intent = new Intent(this, InputNilaiTADosujiDospemActivity.class);
        intent.putExtra("nidn", NIDN);
        intent.putExtra("nama", nama);
        intent.putExtra("judul", judul);
        intent.putExtra("foto", foto);
        startActivity(intent);
    }
}