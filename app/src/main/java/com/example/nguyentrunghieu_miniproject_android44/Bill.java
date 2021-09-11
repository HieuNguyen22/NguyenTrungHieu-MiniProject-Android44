package com.example.nguyentrunghieu_miniproject_android44;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Bill extends AppCompatActivity {

    TextView pizza,kfc, bread, coca, chicken, cake,sum;
    ImageView back;
    Button clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);

        pizza = findViewById(R.id.pizzaCount);
        kfc = findViewById(R.id.kfcCount);
        bread = findViewById(R.id.breadCount);
        coca = findViewById(R.id.cocaCount);
        chicken = findViewById(R.id.chickenCount);
        cake = findViewById(R.id.cakeCount);
        back = findViewById(R.id.back);
        sum = findViewById(R.id.sum);
        clear = findViewById(R.id.clear);

        Intent intent = getIntent();
        int tmp[] = intent.getIntArrayExtra("1");

        pizza.setText(String.valueOf(tmp[0]));
        kfc.setText(String.valueOf(tmp[1]));
        bread.setText(String.valueOf(tmp[2]));
        coca.setText(String.valueOf(tmp[3]));
        chicken.setText(String.valueOf(tmp[4]));
        cake.setText(String.valueOf(tmp[5]));

        String tongTien = sum.getText().toString() +" "+ (tmp[0]*15+tmp[1]*12+tmp[2]*5+tmp[3]*3+tmp[4]*10+tmp[5]*2) +"$";
        sum.setText(tongTien);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Intent data = new Intent();
                setResult(Activity.RESULT_OK,data);
                finish();
            }
        });
    }
}