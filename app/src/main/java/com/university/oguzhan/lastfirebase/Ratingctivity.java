package com.university.oguzhan.lastfirebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Handler;
import android.os.Message;

public class Ratingctivity extends AppCompatActivity {

    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            threadytext = (TextView) findViewById(R.id.threadtext);
            threadytext.setText("Thank you for ur feedback and rate <3");
        }
    };

    public RatingBar ratingBar;
    public TextView threadytext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratingctivity);

        ratingBar = (RatingBar) findViewById(R.id.ratingBar);

        ratingBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        String.valueOf(ratingBar.getRating()), Toast.LENGTH_LONG).show();
            }
        });

    }

    public void ClickThreadButton(View view) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                long futureTime = System.currentTimeMillis() + 5000;
                while (System.currentTimeMillis() < futureTime){
                    synchronized (this){
                        try {
                            wait(futureTime - System.currentTimeMillis());
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                handler.sendEmptyMessage(0);
            }
        };

        Thread ratingThread = new Thread(r);
        ratingThread.start();
    }
}
