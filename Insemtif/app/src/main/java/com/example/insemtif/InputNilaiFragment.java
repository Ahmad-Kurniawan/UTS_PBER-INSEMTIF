package com.example.insemtif;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class InputNilaiFragment extends Fragment implements View.OnClickListener {

    private Button btnMasukTA, btnMasukKP;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_inputnilai, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btnMasukTA = view.findViewById(R.id.masukTA);
        btnMasukTA.setOnClickListener(this);
        btnMasukKP = view.findViewById(R.id.masukKP);
        btnMasukKP.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.masukTA){
            Intent intent = new Intent(getContext(), DaftarMahasiswaTAActivity.class);
            startActivity(intent);
        }else if (view.getId() == R.id.masukKP){
            Intent intent = new Intent(getContext(), DaftarMahasiswaKPActivity.class);
            startActivity(intent);
        }
    }
}