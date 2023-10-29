package com.example.myapplication;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText textView = findViewById(R.id.text2);
        Button button = findViewById(R.id.button);
        EditText textView1 = findViewById(R.id.text3);
        TextView txt = findViewById(R.id.text2);
        TextView txt1 = findViewById(R.id.text3);
        TextView txt2 = findViewById(R.id.mik);
        TextView txt3 = findViewById(R.id.mik1);
        TextView txt4 = findViewById(R.id.txt3);
        TextView txt5 = findViewById(R.id.txt1);
        textView1.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                    // Не используется
                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    if (s.length() > 0) {
                        button.setBackgroundResource(R.drawable.button_enabled);
                    } else {
                        button.setBackgroundResource(R.drawable.button_disabled);
                    }
                }

                @Override
                public void afterTextChanged(Editable s) {
                }
            });
                button.setOnClickListener(View -> {
                    if (textView.getText().length() == 0 || textView1.getText().length() == 0) {
                        Toast.makeText(this, "Вы не заполнили данные", Toast.LENGTH_SHORT).show();
                    } else if (textView.getText().toString().equals("admin") && textView1.getText().toString().equals("admin")) {
                        Toast.makeText(this, "Спасибо что заполнили данные", Toast.LENGTH_SHORT).show();
button.setVisibility(android.view.View.GONE);
textView1.setVisibility(android.view.View.GONE);
textView.setVisibility(android.view.View.GONE);
txt.setVisibility(android.view.View.GONE);
txt1.setVisibility(android.view.View.GONE);
txt2.setVisibility(android.view.View.GONE);
txt3.setVisibility(android.view.View.GONE);
txt4.setVisibility(android.view.View.GONE);
txt5.setVisibility(android.view.View.GONE);
                    } else {
                        Toast.makeText(this, "Вы неправильно заполнили данные", Toast.LENGTH_SHORT).show();
                    }
                });
    }
}