package com.example.insemtif;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.insemtif.adapter.AdapterJadwal;
import com.example.insemtif.data.Constants;
import com.example.insemtif.data.JadwalSeminar;

import java.util.ArrayList;

public class AkunFragment extends Fragment {

    private RecyclerView recyclerView;
    private AdapterJadwal adapter;
    private ArrayList<JadwalSeminar> dataList;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_akun, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TableLayout tableLayout = view.findViewById(R.id.tableLayout);
        recyclerView = view.findViewById(R.id.rvlistjadwal);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dataList = Constants.getJadwalSeminar();
        adapter = new AdapterJadwal(dataList);
        recyclerView.setAdapter(adapter);

    }
}