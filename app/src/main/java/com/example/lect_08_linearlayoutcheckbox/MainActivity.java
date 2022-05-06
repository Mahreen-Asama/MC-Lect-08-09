package com.example.lect_08_linearlayoutcheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    CheckBox done,pending,read;
    Button b,middle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b=findViewById(R.id.button6);

        done=findViewById(R.id.done);
        pending=findViewById(R.id.pending);
        read=findViewById(R.id.read);

        done.setOnClickListener(this);
        pending.setOnClickListener(this);
        read.setOnClickListener(this);

        middle=findViewById(R.id.button6);
        middle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.layout);
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.done:
                if(done.isChecked())
                    b.setText("done checked");
                break;
            case R.id.pending:
                if(pending.isChecked())
                    b.setText("pending checked");
                break;
            case R.id.read:
                if(read.isChecked())
                    b.setText("read checked");
                break;
        }
    }
}