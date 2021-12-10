package com.androidclase.entrenaments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.json.JSONArray;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private TrainingAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<EntrenamentUI> arrayOfEntrenaments = new ArrayList<>();

        mAdapter = new TrainingAdapter(this, arrayOfEntrenaments);

        mListView = (ListView) findViewById(R.id.listLayout);
        mListView.setAdapter(mAdapter);

        populateData();

    }

    private void populateData() {
        EntrenamentUI entrenamentUI1 = new EntrenamentUI(R.drawable.extremitats, new Entrenament("Extremitats a Tope",
                "5 Flexions a terra\n" +
                        "10 Inclinacions d'una cama\n" +
                        "15 Flexions dorsals\n"));
        mAdapter.add(entrenamentUI1);
        EntrenamentUI entrenamentUI2 = new EntrenamentUI(R.drawable.agonia, new Entrenament("Agonia Màxima",
                "100 Flexions inclinades\n" +
                        "100 Flexions\n" +
                        "100 Abdominals\n" +
                        "100 Esquats\n"));
        mAdapter.add(entrenamentUI2);
        EntrenamentUI entrenamentUI3 = new EntrenamentUI(R.drawable.especial, new Entrenament("Entrenament especial",
                "5 Dorsals\n" +
                        "10 Flexions\n" +
                        "15 Esquats\n"));
        mAdapter.add(entrenamentUI3);
        EntrenamentUI entrenamentUI4 = new EntrenamentUI(R.drawable.longitud, new Entrenament("Força i longitud",
                "500 Metres màxima velocitat\n" +
                        "21 Llançaments de pes \n" +
                        "21 Flexions\n"));
        mAdapter.add(entrenamentUI4);
    }
}