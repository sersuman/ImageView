package com.example.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private RadioButton rdoRajeshhamal, rdoBhuvanKc, rdoDayahang;
    private ImageView ivImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdoBhuvanKc = findViewById(R.id.rdoBhuvanKc);
        rdoDayahang = findViewById(R.id.rdoDayahang);
        rdoRajeshhamal = findViewById(R.id.rdoRajeshHamal);
        ivImage = findViewById(R.id.ivImage);

        rdoDayahang.setOnClickListener(this);
        rdoRajeshhamal.setOnClickListener(this);
        rdoBhuvanKc.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.rdoBhuvanKc:
                ivImage.setImageResource(R.drawable.bhuvan);
                Toast toast = Toast.makeText(MainActivity.this, "Bhuvan KC", Toast.LENGTH_LONG);
                toast.show();
                break;
            case R.id.rdoDayahang:
                ivImage.setImageResource(R.drawable.dayahang);
                Toast toast1 = Toast.makeText(MainActivity.this, "Dayahang Rai", Toast.LENGTH_LONG);
                toast1.show();
                break;
            case R.id.rdoRajeshHamal:
                ivImage.setImageResource(R.drawable.rajeshhamal);
                Toast toast2 = Toast.makeText(MainActivity.this, "Rajesh Hamal", Toast.LENGTH_LONG);
                toast2.show();
                break;
        }
    }
}
