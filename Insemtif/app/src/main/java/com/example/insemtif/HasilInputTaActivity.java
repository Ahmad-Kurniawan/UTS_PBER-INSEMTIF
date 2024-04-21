package com.example.insemtif;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import de.hdodenhof.circleimageview.CircleImageView;

public class HasilInputTaActivity extends AppCompatActivity {

    private String nama, nidn, judul;
    private TextView tvNama, tvNidn, tvJudul;
    private CircleImageView cimFoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_input_ta);

        tvNama = findViewById(R.id.tv1);
        tvNidn = findViewById(R.id.tv2);
        cimFoto = findViewById(R.id.circleImageView);
        tvJudul = findViewById(R.id.tv5);
        nama = getIntent().getStringExtra("nama");
        tvNama.setText(nama);
        nidn = getIntent().getStringExtra("nidn");
        tvNidn.setText(nidn);
        int foto = getIntent().getIntExtra("foto", 0);
        Glide.with(this)
                .load(foto)
                .into(cimFoto);
        judul = getIntent().getStringExtra("judul");
        tvJudul.setText(judul);

    }
}