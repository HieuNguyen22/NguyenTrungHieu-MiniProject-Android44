package com.example.nguyentrunghieu_miniproject_android44;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // KHOI TAO
    Button btnLoginCode;
    EditText username;
    EditText password;
    ImageView iconFB, iconGG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TRUYEN ID
        btnLoginCode = findViewById(R.id.btnLogin);
        username = findViewById(R.id.inputEmail);
        password = findViewById(R.id.inputPassword);
        iconFB = findViewById(R.id.facebooklogin);
        iconGG = findViewById(R.id.googlelogin);

        // EVENT LOGIN
        btnLoginCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                if(user.isEmpty() == false && pass.isEmpty() == false) {
                    Toast.makeText(getBaseContext(),"Dang nhap thanh cong", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(getBaseContext(),ChoosingScreen.class);
                    startActivity(intent);
                }
                else Toast.makeText(getBaseContext(),"Dang nhap that bai", Toast.LENGTH_LONG).show();
            }
        });

        // EVENT FACEBOOK
        iconFB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(),ChoosingScreen.class);
                startActivity(intent);
            }
        });

        // EVENT GOOGLE
        iconGG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(),ChoosingScreen.class);
                startActivity(intent);
            }
        });

    }


}