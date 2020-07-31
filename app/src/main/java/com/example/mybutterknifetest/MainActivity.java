package com.example.mybutterknifetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.butterknife_annotations.BindView;
import com.example.butterknife_annotations.OnClick;
import com.example.mybutterknife.MyButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.testTV)
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyButterKnife.bind(this);

    }

    @OnClick({R.id.testTV, R.id.testTV1})
    public void onClickView(View v) {
        switch (v.getId()) {
            case R.id.testTV:
                Log.d("MainActivity", "Click TestTv");
                textView.setText("Inject success");
                break;
            case R.id.testTV1:
                Log.d("MainActivity", "Click TestTv1");
                break;
        }
    }
}