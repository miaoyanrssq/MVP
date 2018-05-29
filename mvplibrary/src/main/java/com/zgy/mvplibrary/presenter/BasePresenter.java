package com.zgy.mvplibrary.presenter;

import com.zgy.mvplibrary.view.IView;

import java.lang.ref.WeakReference;

public class BasePresenter<T extends IView> {

    protected WeakReference<T> weakReference;

    public BasePresenter(){

    }

    public void attachView(T view)
    {
        weakReference = new WeakReference<T>(view);
    }

    public void ditachView()
    {
        weakReference.clear();
    }
}
