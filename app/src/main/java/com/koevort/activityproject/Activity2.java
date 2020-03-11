package com.koevort.activityproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    public static final String EXTRA_TEXT = "com.koevort.activityproject.EXTRA_TEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity.EXTRA_TEXT);

        TextView textView1 = (TextView) findViewById(R.id.textView1);

        textView1.setText(text);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
    }

    private void openActivity3() {
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        String text = editText1.getText().toString();

        Intent intent = new Intent(this, Activity3.class);
        intent.putExtra(Activity2.EXTRA_TEXT, text);
        startActivity(intent);
    }
}
