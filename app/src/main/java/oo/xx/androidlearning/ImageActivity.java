package oo.xx.androidlearning;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class ImageActivity extends AppCompatActivity {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        String url = "http://tp3.sinaimg.cn/1649383490/180/5706347282/1";
        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        Picasso.with(context).load(url).into(imageView);
    }
}
