package com.example.insemtif;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import de.hdodenhof.circleimageview.CircleImageView;

public class InputNilaiKPDosujiDospemActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvNIDN,tvNama;
    private int foto;
    private String nama, nidn, judul;
    private Button btnInputBimbinganKp, btnInputSeminarKp, btnInfo, btnKembali;
    private CircleImageView cimFoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_nilai_kpdosuji_dospem);


        tvNama = findViewById(R.id.tv1);
        tvNIDN = findViewById(R.id.tv2);
        cimFoto = findViewById(R.id.circleImageView);
        btnInputBimbinganKp = findViewById(R.id.masukBimbinganKP);
        btnInputSeminarKp = findViewById(R.id.masukSeminarKP);
        btnInfo = findViewById(R.id.masukInfo);
        btnKembali = findViewById(R.id.kembali);
        nama = getIntent().getStringExtra("nama");
        tvNama.setText(nama);
        nidn = getIntent().getStringExtra("nidn");
        tvNIDN.setText(nidn);
        foto = getIntent().getIntExtra("foto", 0);
        Glide.with(this)
                .load(foto)
                .into(cimFoto);
        judul = getIntent().getStringExtra("judul");
        btnInputSeminarKp.setOnClickListener(this);
        btnInputBimbinganKp.setOnClickListener(this);
        btnInfo.setOnClickListener(this);
        btnKembali.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.masukBimbinganKP){
            Intent intent = new Intent(this, InputNilaiKpDospemActivity.class);
            intent.putExtra("judul", judul);
            startActivity(intent);
        }else if (view.getId() == R.id.masukSeminarKP){
            Intent intent = new Intent(this, InputNilaiKPDosujiActivity.class);
            intent.putExtra("judul", judul);
            startActivity(intent);
        }else if (view.getId() == R.id.masukInfo){
            Intent intent = new Intent(this, HasilInputKPActivity.class);
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