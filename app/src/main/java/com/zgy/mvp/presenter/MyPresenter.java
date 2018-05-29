package com.zgy.mvp.presenter;

import com.zgy.mvp.model.MyModel;
import com.zgy.mvplibrary.model.IModel;
import com.zgy.mvplibrary.presenter.BasePresenter;
import com.zgy.mvplibrary.view.IView;

public class MyPresenter<T extends IView> extends BasePresenter<T> {

    MyModel myModel = new MyModel();

    public MyPresenter(){

    }

    public void fetch(){
        if(weakReference.get() != null){
            weakReference.get().loading();
        }
        if(myModel != null){
            myModel.loadData(new IModel.OnLoadingListener<String>() {
                @Override
                public void onComplete(String data) {
                    weakReference.get().showView(data);
                }
            });
        }
    }
}
