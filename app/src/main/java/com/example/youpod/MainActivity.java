package com.example.youpod;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;

import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    //mTextMessage.setText(R.string.title_home);
                    break;

                case R.id.navigation_YOUFeed:
                    //mTextMessage.setText(R.string.title_YOUFeed);
                    Intent intent1 = new Intent(MainActivity.this, YOUFeed.class);
                    startActivity(intent1);
                    break;

                case R.id.navigation_YOURPod:
                    //mTextMessage.setText(R.string.title_YOURPod);
                    Intent intent2 = new Intent(MainActivity.this, YOURPod.class);
                    startActivity(intent2);
                    break;

                case R.id.navigation_subscribe:
                    //mTextMessage.setText(R.string.title_subscribe);
                    Intent intent3 = new Intent(MainActivity.this, Subscribe.class);
                    startActivity(intent3);
                    break;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }



}
