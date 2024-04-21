package com.example.insemtif;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import de.hdodenhof.circleimageview.CircleImageView;

public class InputNilaiTADosujiDospemActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvNIDN,tvNama;
    private String nama,nidn, judul;
    private Button btnInputBimbinganTA, btnInputSeminarTA, btnInfo, btnKembali;
    private CircleImageView cimFoto;
    int foto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_nilai_ta_dosuji_dospem);

        tvNama = findViewById(R.id.tv1);
        tvNIDN = findViewById(R.id.tv2);
        btnInputBimbinganTA = findViewById(R.id.masukBimbinganTA);
        btnInputSeminarTA = findViewById(R.id.masukSeminarTA);
        cimFoto = findViewById(R.id.circleImageView);
        btnInfo = findViewById(R.id.masukInfo);
        nama = getIntent().getStringExtra("nama");
        tvNama.setText(nama);
        nidn = getIntent().getStringExtra("nidn");
        tvNIDN.setText(nidn);
        foto = getIntent().getIntExtra("foto", 0);
        Glide.with(this)
                .load(foto)
                .into(cimFoto);
        judul = getIntent().getStringExtra("judul");
        btnKembali = findViewById(R.id.kembali);
        btnInputSeminarTA.setOnClickListener(this);
        btnInputBimbinganTA.setOnClickListener(this);
        btnInfo.setOnClickListener(this);
        btnKembali.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.masukBimbinganTA){
            Intent intent = new Intent(this, InputNilaiTaDospemActivity.class);
            intent.putExtra("judul", judul);
            startActivity(intent);
        }else if (view.getId() == R.id.masukSeminarTA){
            Intent intent = new Intent(this, InputNilaiTaDosujiActivity.class);
            intent.putExtra("judul", judul);
            startActivity(intent);
        }else if (view.getId() == R.id.masukInfo){
            Intent intent = new Intent(this, HasilInputTaActivity.class);
            intent.putExtra("nidn", nidn);
            intent.putExtra("nama", nama);
            intent.putExtra("judul", judul);
            intent.putExtra("foto", foto);
            startActivity(intent);
        }else if (view.getId() == R.id.kembali){
           finish();
        }
    }
}