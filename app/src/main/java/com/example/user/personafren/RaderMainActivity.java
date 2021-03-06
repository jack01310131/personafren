package com.example.user.personafren;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class RaderMainActivity extends Activity implements View.OnClickListener {

    ImageView goRader,goMe,goPair;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rader_main);
        goRader = (ImageView) findViewById(R.id.goRader);
        goMe = (ImageView) findViewById(R.id.goMe);
        goPair = (ImageView) findViewById(R.id.goPair);

        goRader.setOnClickListener(this);
        goMe.setOnClickListener(this);
        goPair.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent();
        switch (view.getId()) {
            case R.id.goRader:

                break;
            case R.id.goMe:
                intent.setClass(RaderMainActivity.this, MeMainActivity.class);
                startActivity(intent);
                break;
            case R.id.goPair:
                intent.setClass(RaderMainActivity.this, PairMainActivity.class);
                startActivity(intent);
                break;
        }
    }

}
