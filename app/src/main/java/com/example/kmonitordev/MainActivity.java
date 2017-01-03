package com.example.kmonitordev;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void changeText() {
        TextView textView = (TextView) findViewById(R.id.text);
        textView.setText("Hello Network");
    }

    public void openNetwork(View view) {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.setClassName("com.android.phone", "com.android.phone.MobileNetworkSettings");
        changeText();
        startActivityForResult(intent, 0);
    }
}
