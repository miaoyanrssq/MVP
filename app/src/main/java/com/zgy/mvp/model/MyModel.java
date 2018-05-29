package com.zgy.mvp.model;

import com.zgy.mvplibrary.model.IModel;

import java.lang.String;

public class MyModel implements IModel<String> {
    @Override
    public void loadData(OnLoadingListener<String> onLoadingListener) {
        String data ="测试数据";

        onLoadingListener.onComplete(data);
    }
}
