package com.example.miki.dosactividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public static final String EXTRA_REPLAY = "com.example.miki.dosactividades.extra.REPLAY";
    private EditText mReplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.text_message);
        textView.setText(message);

        mReplay = (EditText) findViewById(R.id.editText_second);


    }

    public void returnReplay(View view) {
        String reply = mReplay.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLAY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }
}
