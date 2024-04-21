package com.example.insemtif;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class InputNilaiKpDospemActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvJudul;
    private Button btnKembali;
    private ImageButton btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_nilai_kp_dospem);

        tvJudul = findViewById(R.id.judul);
        String judul = getIntent().getStringExtra("judul");
        tvJudul.setText(judul);
        btnHome = findViewById(R.id.home);
        btnKembali = findViewById(R.id.kembali);
        btnHome.setOnClickListener(this);
        btnKembali.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.home){
            Intent intent = new Intent(this, NavigationActivity.class);
            startActivity(intent);
        }else if (view.getId() ==R.id.kembali){
            finish();
        }
    }
}