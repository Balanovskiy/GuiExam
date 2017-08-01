package com.ybalanovskiy.guiexam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private int iClkTime = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        final String prefixPrompt = "This no";
        final String suffixPrompt = "Time (s)";

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            
            public void onClick(View v) {
                Log.d("ProgTraceInfo", prefixPrompt + (iClkTime++) + suffixPrompt);
            }
        });
    }
}
