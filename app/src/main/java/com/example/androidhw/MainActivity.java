package com.example.androidhw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
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
        //gets a view byy ID
        findViewById(R.id.btn_download).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText urlEditTxt=findViewById(R.id.input_url);
                Intent imageDownLoadIntent=new Intent(MainActivity.this,ImageDownloaderActivity.class);
                imageDownLoadIntent.putExtra("url",urlEditTxt.getText());
                startActivity(imageDownLoadIntent);
            }
        });


    }
}
