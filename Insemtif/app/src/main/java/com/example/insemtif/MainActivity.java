package com.example.insemtif;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.insemtif.adapter.AdapterKP;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnMasuk;
    private EditText etNama;
    private EditText etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMasuk = findViewById(R.id.masuk);
        etNama = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);

        btnMasuk.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.masuk){
            Intent intent = new Intent(this, NavigationActivity.class);
            intent.putExtra("nama", etNama.getText().toString().trim());
            startActivity(intent);
        }
    }
}