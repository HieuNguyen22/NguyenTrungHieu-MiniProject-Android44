package com.example.nguyentrunghieu_miniproject_android44;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChoosingScreen extends AppCompatActivity {

    // KHOI TAO
    Button pizza, kfc,bread,coca, chicken, cake, order;
    ImageView cart;
    TextView count;

    // KHOI TAO + KHAI BAO SO LUONG

    int amount = 0;
    int[] list = new int[6];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosing_screen);

        // TRUYEN ID
        pizza = findViewById(R.id.pizza);
        kfc = findViewById(R.id.KFC);
        bread = findViewById(R.id.breadEgg);
        coca =  findViewById(R.id.coca);
        chicken = findViewById(R.id.chicken);
        cake = findViewById(R.id.cake);
        cart = findViewById(R.id.cart);
        order = findViewById(R.id.order);
        count = findViewById(R.id.count);

        // EVENT PIZZA
        pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list[0]++;
                count.setText(String.valueOf(++amount));
            }
        });

        // EVENT KFC
        kfc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list[1]++;
                count.setText(String.valueOf(++amount));
            }
        });

        // EVENT BREAD
        bread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list[2]++;
                count.setText(String.valueOf(++amount));
            }
        });

        // EVENT COCA
        coca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list[3]++;
                count.setText(String.valueOf(++amount));
            }
        });

        // EVENT CHICKEN
        chicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list[4]++;
                count.setText(String.valueOf(++amount));
            }
        });

        // EVENT CAKE
        cake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list[5]++;
                count.setText(String.valueOf(++amount));
            }
        });

        // EVENT CART
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getBaseContext(),Bill.class);
                intent1.putExtra("1",list);
                startActivityForResult(intent1,113);
            }

        });


        // EVENT ORDER
        order.setOnClickListener(new View.OnClickListener() {
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
                count.setText("0");
                amount = 0;

                } else {
                }

        }

    }

}