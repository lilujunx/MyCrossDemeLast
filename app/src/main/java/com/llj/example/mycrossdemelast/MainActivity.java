package com.llj.example.mycrossdemelast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MyTest mMyTest;
    private EditText mEdt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEdt = (EditText) findViewById(R.id.edt);




        new Button(this).setOnClickListener(l -> {
            Toast.makeText(this, "lalala", Toast.LENGTH_SHORT).show();
        });
//        something


    }

    public void setTest(MyTest myTest) {
        this.mMyTest = myTest;
    }


    interface MyTest {
        void xx(int x, int y, int z, String old);
    }
}
