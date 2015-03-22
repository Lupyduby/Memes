package com.cs175.mememememes;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;

import com.cs175.mymemes.R;

public class Memememes_View extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mememememes_view);

        int[] image = {R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,
                R.drawable.image5,R.drawable.image6,R.drawable.image7,R.drawable.image8,
                R.drawable.image9,R.drawable.image10};

        TextView titles = (TextView) findViewById(R.id.textView1);
        TextView descs = (TextView) findViewById(R.id.textView2);
        ImageView imgs = (ImageView) findViewById(R.id.imageView1);

        Bundle extras = getIntent().getExtras();
        Intent i = getIntent();

        String title = i.getStringExtra("title");
        String desc = i.getStringExtra("desc");
        int pos = i.getIntExtra("image", 0);


        titles.setText(title);
        descs.setText(desc);
        imgs.setImageResource(image[pos]);

    }
}
