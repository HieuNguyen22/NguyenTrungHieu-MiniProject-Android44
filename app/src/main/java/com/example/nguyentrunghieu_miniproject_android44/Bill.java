package com.example.nguyentrunghieu_miniproject_android44;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.databinding.DataBindingUtil;
import com.example.nguyentrunghieu_miniproject_android44.databinding.ActivityBillBinding;

public class Bill extends AppCompatActivity {

    ActivityBillBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_bill);

        binding = DataBindingUtil.setContentView(this,R.layout.activity_bill);

        Intent intent = getIntent();
        int tmp[] = intent.getIntArrayExtra("1");

        binding.pizzaCount.setText(String.valueOf(tmp[0]));
        binding.kfcCount.setText(String.valueOf(tmp[1]));
        binding.breadCount.setText(String.valueOf(tmp[2]));
        binding.cocaCount.setText(String.valueOf(tmp[3]));
        binding.chickenCount.setText(String.valueOf(tmp[4]));
        binding.cakeCount.setText(String.valueOf(tmp[5]));

        String tongTien = binding.sum.getText().toString() +" "+ (tmp[0]*15+tmp[1]*12+tmp[2]*5+tmp[3]*3+tmp[4]*10+tmp[5]*2) +"$";
        binding.sum.setText(tongTien);

        binding.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        binding.clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Intent data = new Intent();
                setResult(Activity.RESULT_OK,data);
                finish();
            }
        });
    }
}