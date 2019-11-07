package com.example.androidhw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button doneBtn=(Button)findViewById(R.id.doneBtn);
        doneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                show me a message with TODA:) in the same time that i click on done
//                Toast.makeText(getApplicationContext(),"TODA :)",Toast.LENGTH_LONG).show();

//                show in message the sequance that write on editText line
                EditText textField=(EditText)findViewById(R.id.textField);
                Toast.makeText(getApplicationContext(),textField.getText(),Toast.LENGTH_LONG).show();
            }
        });

    }
}
