package com.example.androidhw;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

public class ImageDownloaderActivity extends AppCompatActivity {

    private static final String TAG ="hod";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_downloader);
//        onImageDownloaded();
        String url=getIntent().getExtras().get("url").toString();
        download(url);
    }

    private void download(String url) {
        //download image here
        final OkHttpClient client = new OkHttpClient();

        final Request request = new Request.Builder()
                .url("https://www.google.com/url?sa=i&source=images&cd=&ved=2ahUKEwjn6OrH8eflAhXIZlAKHZsaBywQjRx6BAgBEAQ&url=http%3A%2F%2Fwww.baba-mail.co.il%2Fcontent.aspx%3Femailid%3D44508&psig=AOvVaw3-X22ohW9e1YvMifY_3ol6&ust=1573758540125642")
                .build();
       new Thread(new Runnable() {
           @Override
           public void run() {
               try {
                   Response response = client.newCall(request).execute();
//            response.body()
                   Log.d(TAG, "response " + response);
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
       });
    }
}
