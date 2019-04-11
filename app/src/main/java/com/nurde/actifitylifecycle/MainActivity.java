package com.nurde.actifitylifecycle;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnClose,btnStartActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClose = (Button) findViewById(R.id.btnClose);
        btnStartActivity = (Button) findViewById(R.id.btnStartActivity);

        btnClose.setOnClickListener(this);
        btnStartActivity.setOnClickListener(this);

        Toast.makeText(this, "Activity: onCreate()", Toast.LENGTH_SHORT).show();
    }
    protected void onStart(){
        super.onStart();

        Toast.makeText(this, "Activity: onStart()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(this, "Activity: onResume()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(this, "Activity: onPause()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(this, "Activity: onStop()", Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnStartActivity:
                // buka activity browser
                Intent petanikodeActivity = new Intent(Intent.ACTION_VIEW);
                petanikodeActivity.setData(Uri.parse("http://petanikode.com"));
                startActivity(petanikodeActivity);
                break;
            case R.id.btnActivityIg:
                // buka activity browser
                Intent ActivityInstagram = new Intent(Intent.ACTION_VIEW);
                ActivityInstagram.setData(Uri.parse("http://www.instagram.com"));
                startActivity(ActivityInstagram);
                break;
            case R.id.btnClose:
                finish();
                break;
        }
    }
}