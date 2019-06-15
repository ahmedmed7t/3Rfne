package com.example.crazynet.a3rfne;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button , button1 ,  button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("org.tensorflow.lite.examples.classification");
                if (launchIntent != null) {
                    startActivity(launchIntent);//null pointer check in case package name was not found
                }
            }
        });


        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.google.android.gms.samples.vision.barcodereader");
                if (launchIntent != null) {
                    startActivity(launchIntent);//null pointer check in case package name was not found
                }
            }
        });

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.google.android.gms.samples.vision.ocrreader");
                if (launchIntent != null) {
                    startActivity(launchIntent);
                }
            }
        });
    }
}
