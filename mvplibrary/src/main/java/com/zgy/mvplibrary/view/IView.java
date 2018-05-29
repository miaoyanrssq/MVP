package com.zgy.mvplibrary.view;

public interface IView<T> {

    void loading();
    void showView(T data);
}
