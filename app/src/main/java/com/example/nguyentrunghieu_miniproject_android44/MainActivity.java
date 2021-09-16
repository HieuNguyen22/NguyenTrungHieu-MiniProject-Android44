package com.example.nguyentrunghieu_miniproject_android44;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.databinding.DataBindingUtil;
import com.example.nguyentrunghieu_miniproject_android44.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // KHOI TAO
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        // TRUYEN ID
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        // EVENT LOGIN
        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = binding.inputEmail.getText().toString();
                String pass = binding.inputPassword.getText().toString();
                if(user.isEmpty() == false && pass.isEmpty() == false) {
                    Toast.makeText(getBaseContext(),"Dang nhap thanh cong", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(getBaseContext(),ChoosingScreen.class);
                    startActivity(intent);
                }
                else Toast.makeText(getBaseContext(),"Dang nhap that bai", Toast.LENGTH_LONG).show();
            }
        });

        // EVENT FACEBOOK
        binding.facebooklogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(),ChoosingScreen.class);
                startActivity(intent);
            }
        });

        // EVENT GOOGLE
        binding.googlelogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(),ChoosingScreen.class);
                startActivity(intent);
            }
        });

    }


}