package com.zgy.mvp;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.zgy.mvp.presenter.MyPresenter;
import com.zgy.mvplibrary.BaseActivity;
import com.zgy.mvplibrary.view.IView;

public class MainActivity extends BaseActivity<IView, MyPresenter<IView>> implements IView<String>{

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text);
        presenter.fetch();
    }

    @Override
    public MyPresenter createPresenter() {
        return new MyPresenter();
    }

    @Override
    public void loading() {

        Toast.makeText(this, "loading", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showView(String data) {

        textView.setText(data);


    }
}
