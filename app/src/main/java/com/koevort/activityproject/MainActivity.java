package com.koevort.activityproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_TEXT = "com.koevort.activityproject.EXTRA_TEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }

    private void openActivity2() {
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        String text = editText1.getText().toString();

        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra(MainActivity.EXTRA_TEXT, text);
        startActivity(intent);
    }
}
