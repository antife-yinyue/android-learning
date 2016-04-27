package oo.xx.androidlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(this);

        Button btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        System.out.println("Button Clicked");

        Intent intent;

        switch (view.getId()) {
            case R.id.button1:
                intent = new Intent(this, ImageActivity.class);
                break;

            case R.id.button2:
                intent = new Intent(this, WebviewActivity.class);
                break;

            default:
                intent = new Intent(this, MainActivity.class);
                break;
        }

        startActivity(intent);
    }
}
