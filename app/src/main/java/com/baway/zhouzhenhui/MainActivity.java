package com.baway.zhouzhenhui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TopBar mTopBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_main);



       // setContentView(R.layout.activity_custom_view);
        mTopBar = (TopBar) findViewById(R.id.topBar);
        mTopBar.setOnTopBarClickListener(new TopBar.OnTopBarClickListener() {
            @Override
            public void leftClick() {
                Toast.makeText(MainActivity.this, "点击了 返回", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void rightClick() {
                Toast.makeText(MainActivity.this, "点击了 更多", Toast.LENGTH_SHORT).show();
            }
        });

    }

}
