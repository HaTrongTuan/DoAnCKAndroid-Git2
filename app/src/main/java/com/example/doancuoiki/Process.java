package com.example.doancuoiki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class Process extends AppCompatActivity {
    Spinner spSapxep;
    ArrayList<String> Sapxep;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_process);
        this.spSapxep = (Spinner) findViewById(R.id.spSapxep);
        loadData();

    }

    private void loadData() {
        Sapxep = new ArrayList<>();
        Sapxep.add("Sắp xếp theo mới nhất");
        Sapxep.add("Sắp xếp theo cũ nhất");
        adapter = new ArrayAdapter<String>(Process.this, android.R.layout.simple_spinner_dropdown_item);
        adapter.addAll(Sapxep);
        spSapxep.setAdapter(adapter);
    }

}