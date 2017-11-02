package com.it.hungvt.mvpstructure.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Administrator on 11/2/2017.
 */

public abstract class BaseActivity<T extends BasePresenter> extends AppCompatActivity
        implements BaseView<T> {

    private T presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int contentViewId = getContentViewId();
        if (contentViewId>0){
            setContentView(contentViewId);
            presenter = createPresenter();
            initComponents();
        }
    }

    @Override
    public T getPresenter() {
        return presenter;
    }

    public abstract int getContentViewId();
    public abstract void initComponents();
}
