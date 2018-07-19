package com.example.witono.jogjaflight;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void tombol_login(View view){

        Intent intents = new Intent(LoginActivity.this,Main2Activity.class);
        startActivity(intents);

    }
}
