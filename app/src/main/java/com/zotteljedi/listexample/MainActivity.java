package com.zotteljedi.listexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = findViewById(R.id.myList);

        List<Item> items = new ArrayList<>();
        Item myItem = new Item("Tee kochen", "Wasser muss auf 100....");
        items.add(myItem);

        ItemAdapter adapter = new ItemAdapter(getApplicationContext(), R.layout.item, items);

        myListView.setAdapter(adapter);
    }
}
