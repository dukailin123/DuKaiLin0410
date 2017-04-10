package com.example.administrator.dukailin0410;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.sql.Time;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout main= (LinearLayout) findViewById(R.id.activity_main);
      Button btname= (Button) findViewById(R.id.btkai);
        Button btchon= (Button) findViewById(R.id.btchong);
        main.addView(new MyView(this));
        MyView my=new MyView(this);
        my.setList(btname);
        btname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




            }
        });
    }


}
