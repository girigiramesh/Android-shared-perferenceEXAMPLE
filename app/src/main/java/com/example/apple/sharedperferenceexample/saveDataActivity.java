package com.example.apple.sharedperferenceexample;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class saveDataActivity extends AppCompatActivity {
    private TextView gt_name, gt_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_data);
        gt_name = (TextView) findViewById(R.id.gt_name);
        gt_pass = (TextView) findViewById(R.id.gt_pass);
        SharedPreferences sharedPreferences = getSharedPreferences(Constant.ME, Context.MODE_PRIVATE);
        String name = sharedPreferences.getString(Constant.EXTRA_USERNAME, "no data found");
        String pass = sharedPreferences.getString(Constant.EXTRA_PASSWORD, "no data found");
        gt_name.setText(name);
        gt_pass.setText(pass);

    }
}
