package com.example.dataentryapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    Button formBtn;
    ListView listView;
    List<Map<String, String>> dataList;
    static final String KEY_TITLE = "title";
    static final String KEY_DESCRIPTION = "description";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        formBtn = findViewById(R.id.formBtn);
        listView = findViewById(R.id.listView);
        dataList = new ArrayList<>();

        HashMap<String, String> item1 = new HashMap<>();
        item1.put(KEY_TITLE, "Welcome to DataEntry App");
        item1.put(KEY_DESCRIPTION, "In this we will fetch & display dynamically using ListView");
        dataList.add(item1);

        HashMap<String, String> item2 = new HashMap<>();
        item2.put(KEY_TITLE, "First Item Data");
        item2.put(KEY_DESCRIPTION, "Sample description of first data");
        dataList.add(item2);

        HashMap<String, String> item3 = new HashMap<>();
        item3.put(KEY_TITLE, "Second Data");
        item3.put(KEY_DESCRIPTION, "Sample description of second data");
        dataList.add(item3);

        HashMap<String, String> item4 = new HashMap<>();
        item4.put(KEY_TITLE, "Third data");
        item4.put(KEY_DESCRIPTION, "Sample description of third data");
        dataList.add(item4);

        HashMap<String, String> item5 = new HashMap<>();
        item5.put(KEY_TITLE, "Recorded data");
        item5.put(KEY_DESCRIPTION, "Sample description of fourth data");
        dataList.add(item5);

        HashMap<String, String> item6 = new HashMap<>();
        item6.put(KEY_TITLE, "Important Note");
        item6.put(KEY_DESCRIPTION, "Sample description of fifth data");
        dataList.add(item6);

        HashMap<String, String> item7 = new HashMap<>();
        item7.put(KEY_TITLE, "Important Note");
        item7.put(KEY_DESCRIPTION, "Sample description of fifth data");
        dataList.add(item7);

        HashMap<String, String> item8 = new HashMap<>();
        item8.put(KEY_TITLE, "Important Note");
        item8.put(KEY_DESCRIPTION, "Sample description of fifth data");
        dataList.add(item8);

        HashMap<String, String> item9 = new HashMap<>();
        item9.put(KEY_TITLE, "Important Note");
        item9.put(KEY_DESCRIPTION, "Sample description of fifth data");
        dataList.add(item9);

        HashMap<String, String> item10 = new HashMap<>();
        item10.put(KEY_TITLE, "Important Note");
        item10.put(KEY_DESCRIPTION, "Sample description of fifth data");
        dataList.add(item10);

        HashMap<String, String> item11 = new HashMap<>();
        item11.put(KEY_TITLE, "Important Note");
        item11.put(KEY_DESCRIPTION, "Sample description of fifth data");
        dataList.add(item11);

        HashMap<String, String> item12 = new HashMap<>();
        item12.put(KEY_TITLE, "Important Note");
        item12.put(KEY_DESCRIPTION, "Sample description of fifth data");
        dataList.add(item12);

        HashMap<String, String> item13 = new HashMap<>();
        item13.put(KEY_TITLE, "Important Note");
        item13.put(KEY_DESCRIPTION, "Sample description of fifth data");
        dataList.add(item13);

        HashMap<String, String> item14 = new HashMap<>();
        item14.put(KEY_TITLE, "Important Note");
        item14.put(KEY_DESCRIPTION, "Sample description of fifth data");
        dataList.add(item14);

        HashMap<String, String> item15 = new HashMap<>();
        item15.put(KEY_TITLE, "Important Note");
        item15.put(KEY_DESCRIPTION, "Sample description of fifth data");
        dataList.add(item15);

        HashMap<String, String> item16 = new HashMap<>();
        item16.put(KEY_TITLE, "Important Note");
        item16.put(KEY_DESCRIPTION, "Sample description of fifth data");
        dataList.add(item16);

        String[] value = {KEY_TITLE, KEY_DESCRIPTION};
        int[] parse = {android.R.id.text1, android.R.id.text2};

        SimpleAdapter adapter = new SimpleAdapter(this, dataList, android.R.layout.simple_list_item_2, value, parse);

        listView.setAdapter(adapter);

        formBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FormActivity.class);
                startActivity(intent);
            }
        });

    }
}