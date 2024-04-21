package com.example.insemtif;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.insemtif.adapter.AdapterKP;
import com.example.insemtif.data.Constants;
import com.example.insemtif.data.MahasiswaKP;

import java.util.ArrayList;

public class DaftarMahasiswaKPActivity extends AppCompatActivity implements AppInterface  {

    private RecyclerView recyclerView;
    private AdapterKP adapter;
    private ArrayList<MahasiswaKP> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_mahasiswa_kpactivity);

        recyclerView = findViewById(R.id.rvlist);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        dataList = Constants.getMahasiswaKPData();
        adapter = new AdapterKP(dataList,this);
        recyclerView.setAdapter(adapter);
    }


    @Override
    public void onItemClicked(String NIDN, String nama, String judul, int foto) {
        Intent intent = new Intent(this, InputNilaiKPDosujiDospemActivity.class);
        intent.putExtra("nidn", NIDN);
        intent.putExtra("nama", nama);
        intent.putExtra("judul", judul);
        intent.putExtra("foto", foto);
        startActivity(intent);
    }
}