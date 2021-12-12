package com.example.makeitrain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button MakeItRain;
    private TextView moneyValue;
    private Button showInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MakeItRain=findViewById(R.id.buttonMakeItRain);
        moneyValue=findViewById(R.id.moneyValue);
        showInfo=findViewById(R.id.buttonShowInfo);

    }
    public void showMoney(View view){
        Log.d("ShowMoney", "onClick : Make It Rain !");
    }
}