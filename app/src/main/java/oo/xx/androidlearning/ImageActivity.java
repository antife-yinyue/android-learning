package oo.xx.androidlearning;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class ImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        Picasso.with(imageView.getContext())
            .load("http://cdn.duitang.com/uploads/item/201603/06/20160306115628_dfwuc.jpeg")
            .into(imageView);
    }
}
