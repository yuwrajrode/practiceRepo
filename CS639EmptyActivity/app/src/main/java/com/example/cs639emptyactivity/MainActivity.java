package com.example.cs639emptyactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_click = (Button) findViewById(R.id.button);
        btn_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MAINACTIVITY","in on click btn_click");
                btn_click.setText("Click Me Now:-)");
                btn_click.setBackgroundColor(getColor(R.color.black));
            }
        });
    }
}