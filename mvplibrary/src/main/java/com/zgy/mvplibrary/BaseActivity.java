package com.zgy.mvplibrary;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.zgy.mvplibrary.presenter.BasePresenter;
import com.zgy.mvplibrary.view.IView;

/**
* 基类，presenter的绑定和解绑
* @author zhengy
* create at 2018/5/29 上午9:15
**/
public abstract class BaseActivity<V extends IView, T extends BasePresenter<V>> extends AppCompatActivity {

    protected T presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        presenter = createPresenter();
        presenter.attachView((V)this);

    }

    protected abstract T createPresenter() ;


    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.ditachView();
    }
}
