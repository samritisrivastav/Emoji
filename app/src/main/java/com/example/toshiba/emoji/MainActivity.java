package com.example.toshiba.emoji;

import android.media.Image;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView Emoji_text;
    Button angry_btn,huhh_btn,chup_btn,inlove_btn;
    ImageView mood;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Emoji_text=(TextView) findViewById(R.id.text_view);
        angry_btn= (Button)   findViewById(R.id.angry_id);
        huhh_btn=(Button)   findViewById(R.id.huhh_id);
        chup_btn=(Button)   findViewById(R.id.chup_id);
        inlove_btn=(Button) findViewById(R.id.inlove_id);
        mood=(ImageView) findViewById(R.id.mood);
        inlove_btn.setOnClickListener(onbtnclick);
        angry_btn.setOnClickListener(onbtnclick);
        huhh_btn.setOnClickListener(onbtnclick);
        chup_btn.setOnClickListener(onbtnclick);

    }


    public View.OnClickListener onbtnclick=new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            if(v.getId()== R.id.angry_id)
            {
                mood.setImageDrawable(getResources().getDrawable(R.drawable.angry));
            }
            if(v.getId()== R.id.chup_id)
            {
                mood.setImageDrawable(getResources().getDrawable(R.drawable.chup));
            }

            if(v.getId()== R.id.inlove_id)
            {
                mood.setImageDrawable(getResources().getDrawable(R.drawable.inlove));

            }
            if(v.getId()== R.id.huhh_id)
            {
                mood.setImageDrawable(getResources().getDrawable(R.drawable.huhh));

            }


        }
    };


}





