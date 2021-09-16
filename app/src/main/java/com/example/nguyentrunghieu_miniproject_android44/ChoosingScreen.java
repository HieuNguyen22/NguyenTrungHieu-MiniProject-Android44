package com.example.nguyentrunghieu_miniproject_android44;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingComponent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.databinding.DataBindingUtil;
import com.example.nguyentrunghieu_miniproject_android44.databinding.ActivityChoosingScreenBinding;


public class ChoosingScreen extends AppCompatActivity {

    // KHOI TAO
    ActivityChoosingScreenBinding binding;

    // KHOI TAO + KHAI BAO SO LUONG

    int amount = 0;
    int[] list = new int[6];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_choosing_screen);

        // TRUYEN ID
        binding = DataBindingUtil.setContentView(this,R.layout.activity_choosing_screen);

        // EVENT PIZZA
        binding.pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list[0]++;
                binding.count.setText(String.valueOf(++amount));
            }
        });

        // EVENT KFC
        binding.KFC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list[1]++;
                binding.count.setText(String.valueOf(++amount));
            }
        });

        // EVENT BREAD
        binding.breadEgg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list[2]++;
                binding.count.setText(String.valueOf(++amount));
            }
        });

        // EVENT COCA
        binding.coca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list[3]++;
                binding.count.setText(String.valueOf(++amount));
            }
        });

        // EVENT CHICKEN
        binding.chicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list[4]++;
                binding.count.setText(String.valueOf(++amount));
            }
        });

        // EVENT CAKE
        binding.cake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list[5]++;
                binding.count.setText(String.valueOf(++amount));
            }
        });

        // EVENT CART
        binding.cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getBaseContext(),Bill.class);
                intent1.putExtra("1",list);
                startActivityForResult(intent1,113);
            }

        });


        // EVENT ORDER
        binding.order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Đặt hàng thành công", Toast.LENGTH_LONG).show();
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (resultCode) {
            case RESULT_OK:
                String name = data.getStringExtra("nameAdd");

                if (requestCode == 113) {
                    for (int i = 0; i < 6; i++) {
                        list[i] = 0;
                    }
                binding.count.setText("0");
                amount = 0;

                } else {
                }

        }

    }

}