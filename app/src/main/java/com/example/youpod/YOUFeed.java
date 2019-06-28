package com.example.youpod;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;



public class YOUFeed extends AppCompatActivity {

    ImageButton feed_podcast_b1, feed_podcast_b2, feed_podcast_b3;

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    //mTextMessage.setText(R.string.title_home);
                    Intent intent1 = new Intent(YOUFeed.this, MainActivity.class);
                    startActivity(intent1);
                    return true;

                case R.id.navigation_YOUFeed:
                    //mTextMessage.setText(R.string.title_YOUFeed);
                    return true;

                case R.id.navigation_YOURPod:
                    //mTextMessage.setText(R.string.title_YOURPod);
                    Intent intent2 = new Intent(YOUFeed.this, YOURPod.class);
                    startActivity(intent2);
                    return true;

                case R.id.navigation_subscribe:
                    //mTextMessage.setText(R.string.title_subscribe);
                    Intent intent3 = new Intent(YOUFeed.this, Subscribe.class);
                    startActivity(intent3);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_feed);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


        feed_podcast_b1 = (ImageButton) findViewById(R.id.feed_podcast_b1);

        feed_podcast_b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentloadNewActivity = new Intent(YOUFeed.this, Podcast1.class);
                        startActivity(intentloadNewActivity);
            }
        });



        feed_podcast_b2 = (ImageButton) findViewById(R.id.feed_podcast_b2);

        feed_podcast_b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentloadNewActivity = new Intent(YOUFeed.this, Podcast2.class);
                startActivity(intentloadNewActivity);
            }
        });



        feed_podcast_b3 = (ImageButton) findViewById(R.id.feed_podcast_b3);

        feed_podcast_b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentloadNewActivity = new Intent(YOUFeed.this, Podcast3.class);
                startActivity(intentloadNewActivity);
            }
        });


    }

}
