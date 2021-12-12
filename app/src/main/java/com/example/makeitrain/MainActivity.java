package com.example.makeitrain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private Button MakeItRain;
    private TextView moneyValue;
    private Button showInfo;
    private int moneyCounter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MakeItRain=findViewById(R.id.buttonMakeItRain);
        moneyValue=findViewById(R.id.moneyValue);
        showInfo=findViewById(R.id.buttonShowInfo);

    }
    public void showMoney(View view){
        NumberFormat numberFormat=NumberFormat.getNumberInstance(new Locale("en","IN"));
        moneyCounter+=1000;
        moneyValue.setText(String.valueOf(numberFormat.format(moneyCounter))+" /-");
        Log.d("ShowMoney", "onClick : Make It Rain !"+moneyCounter+" /-");
    }
    public void showInfo(View view){
        //Toast.makeText(MainActivity.this,R.string.app_info,Toast.LENGTH_SHORT).show();
        Snackbar.make(view,R.string.app_info, BaseTransientBottomBar.LENGTH_SHORT)
                .setAction(
                        "More",view1 -> {
                            Log.d("SnackBar", "showInfo: Snack Bar More");
                        }
                ).show();
    }
}