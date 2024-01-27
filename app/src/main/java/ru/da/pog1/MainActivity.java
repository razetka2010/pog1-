package ru.da.pog1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private LinearLayout b_1;
    private LinearLayout b_2;
    private LinearLayout b_3;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b_1 = findViewById(R.id.pog1);
        b_2 = findViewById(R.id.pog2);
        b_3 = findViewById(R.id.pog3);
        btn = findViewById(R.id.btn);
    }

    public void onClickStart(View view) {
    }
}