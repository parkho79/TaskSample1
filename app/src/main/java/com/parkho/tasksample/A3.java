package com.parkho.tasksample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;

public class A3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a3);

        OnClickListener clickListener = new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), B1.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        };
        findViewById(R.id.btn_start).setOnClickListener(clickListener);
    }
}
