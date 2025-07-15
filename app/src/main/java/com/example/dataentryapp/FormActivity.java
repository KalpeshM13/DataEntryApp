package com.example.dataentryapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FormActivity extends AppCompatActivity {

    Button mainBtn, submitBtn;
    EditText editEmail,editName;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_form);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        editEmail = findViewById(R.id.editEmail);
        editName = findViewById(R.id.editName);
        mainBtn = findViewById(R.id.mainBtn);
        submitBtn = findViewById(R.id.submitBtn);



        mainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputName = editName.getText().toString();
                String inputEmail = editEmail.getText().toString();

                if (inputName.isEmpty()){
                    editName.setError("Name can't be Empty");
                } else if (inputEmail.isEmpty()) {
                    editEmail.setError("Email can't be Empty");
                } else {
                    Toast.makeText(FormActivity.this, "Details submitted successfully!", Toast.LENGTH_SHORT).show();
                    Toast.makeText(FormActivity.this, "Welcome " + inputName + "!", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(FormActivity.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        });

    }
}