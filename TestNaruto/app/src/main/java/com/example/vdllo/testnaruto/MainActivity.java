package com.example.vdllo.testnaruto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn,my_btn;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn);
        my_btn = (Button) findViewById(R.id.my_btn);
        my_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,NextActivity.class);
                startActivity(intent);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "小胡小胡,下雨不愁", Toast.LENGTH_SHORT).show();
            }
        });

        //图片
        imageView = (ImageView) findViewById(R.id.iv);
    }

    //创建好了

    //闪屏完成

    //胡耐心是猪

    //这我都知道

    //happy


}
