package com.zgy.mvplibrary.model;


public interface IModel<T> {

    void loadData(OnLoadingListener<T> onLoadingListener);

    interface OnLoadingListener<T>{
        void onComplete(T data);
    }
}
