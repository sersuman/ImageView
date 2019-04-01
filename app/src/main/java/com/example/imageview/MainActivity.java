package com.example.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private RadioButton rdoRajeshhamal, rdoBhuvanKc, rdoDayahang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdoBhuvanKc = findViewById(R.id.rdoBhuvanKc);
        rdoDayahang = findViewById(R.id.rdoDayahang);
        rdoRajeshhamal = findViewById(R.id.rdoRajeshHamal);

        rdoDayahang.setOnClickListener(this);
        rdoRajeshhamal.setOnClickListener(this);
        rdoBhuvanKc.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.rdoBhuvanKc:
                Toast.makeText(MainActivity.this, "Bhuvan KC", Toast.LENGTH_LONG).show();
                break;
            case R.id.rdoDayahang:
                Toast.makeText(MainActivity.this, "Dayahang Rai", Toast.LENGTH_LONG).show();
                break;
            case R.id.rdoRajeshHamal:
                Toast.makeText(MainActivity.this, "Rajesh Hamal", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
