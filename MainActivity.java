package com.madapps.add_to_cartwithquantitycontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText rst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rst = findViewById(R.id.rst);
    }
    public void morefunt(View view) {
        TextView t = findViewById(R.id.prnumbert);
        t.setText(String.valueOf(Integer.parseInt(t.getText().toString().trim()) + 1));
    }
    public void lessfunt(View view) {
        TextView t = findViewById(R.id.prnumbert);
        ImageView l = findViewById(R.id.lesst);
        ImageView m = findViewById(R.id.moret);

        if (t.getText().toString().trim().toLowerCase().equals("1")) {
            t.setText("Add");
            l.setVisibility(View.GONE);
            m.setVisibility(View.GONE);
            rst.setEnabled(false);
        } else {
            t.setText(String.valueOf(Integer.parseInt(t.getText().toString().trim()) - 1));
        }

    }
    public void onet(View view) {
        TextView t = findViewById(R.id.prnumbert);
        ImageView l = findViewById(R.id.lesst);
        ImageView m = findViewById(R.id.moret);
        if (t.getText().toString().trim().toLowerCase().equals("add")) {
            t.setText("1");
            l.setVisibility(View.VISIBLE);
            rst.setEnabled(true);
            m.setVisibility(View.VISIBLE);
        }

    }
}
