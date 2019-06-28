package com.example.youpod;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class YOURPod extends AppCompatActivity {

    private TextView mTextMessage;
    private Button button;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    //mTextMessage.setText(R.string.title_home);
                    Intent intent1 = new Intent(YOURPod.this, MainActivity.class);
                    startActivity(intent1);
                    return true;

                case R.id.navigation_YOUFeed:
                    //mTextMessage.setText(R.string.title_YOUFeed);
                    Intent intent2 = new Intent(YOURPod.this, YOUFeed.class);
                    startActivity(intent2);
                    return true;

                case R.id.navigation_YOURPod:
                    //mTextMessage.setText(R.string.title_YOURPod);
                    return true;

                case R.id.navigation_subscribe:
                    //mTextMessage.setText(R.string.title_subscribe);
                    Intent intent3 = new Intent(YOURPod.this, Subscribe.class);
                    startActivity(intent3);
                    return true;
            }
            return false;
        }
    };


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_yourpod);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        button = findViewById(R.id.regButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegisterActivity();
            }
        });
    }


    public void openRegisterActivity(){
        Intent myIntent = new Intent(this, Register.class);
        startActivity(myIntent);
    }



}
