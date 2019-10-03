package com.e.proteintracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.e.proteintracker.Adapter.MahasiswaAdapter;
import com.e.proteintracker.Model.Mahasiswa;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter mahasiswaAdapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        addData();
        recyclerView = findViewById(R.id.RVMahasiswa);
        mahasiswaAdapter = new MahasiswaAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new
                LinearLayoutManager(RecyclerViewActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mahasiswaAdapter);
    }

    private void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Cindy Claudya",
                "72170131" ,"123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Yalina Hosea",
                "72170112", "987654321"));
        mahasiswaArrayList.add(new Mahasiswa("Marni Eva",
                "72170166", "987648765"));
        mahasiswaArrayList.add(new Mahasiswa("Angga Dwikaharap",
                "72170155", "098758124"));
    }
}


