package com.mrhi.ex30activity6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickDial(View view) {
        Intent intent= new Intent();
        //intent.setAction("android.intent.action.DIAL");
        intent.setAction(Intent.ACTION_DIAL);

        Uri uri= Uri.parse("tel:01012345678");
        intent.setData(uri);

        startActivity(intent);
    }

    public void clickSMS(View view) {
        Intent intent= new Intent();
        intent.setAction(Intent.ACTION_SENDTO);
        intent.setData( Uri.parse("smsto:01012345678,01011112222"));

        intent.putExtra("sms_body", "Hello.. nice to meet you.");

        startActivity(intent);
    }

    public void clickWeb(View view) {
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.naver.com"));
        startActivity(intent);
    }

    public void clickGallery(View view) {
        Intent intent= new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        startActivity(intent);
    }

    public void clickCamera(View view) {
        Intent intent= new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(intent);
    }
}
