package com.example.jay.popupwindowdemo;

import com.example.jay.popupwindowdemo.widget.MyPopupWindow;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_show)
    TextView tvShow;

    @BindView(R.id.cl_main)
    ConstraintLayout clMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.tv_show)
    public void onViewClicked() {
        initPopup();
    }

    private void initPopup() {
        MyPopupWindow popupWindow = new MyPopupWindow(this);
        View contentView = LayoutInflater.from(this).inflate(R.layout.layout_popup, null);
        popupWindow.setContentView(contentView);
        popupWindow.showAtLocation(clMain, Gravity.CENTER, 0, 0);
    }
}
