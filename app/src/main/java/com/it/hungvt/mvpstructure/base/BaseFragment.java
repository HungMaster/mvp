package com.it.hungvt.mvpstructure.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 11/2/2017.
 */

public abstract class BaseFragment<T extends BasePresenter> extends Fragment
        implements BaseView<T> {

    private T presenter;
    private View itemView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(getFragmentLayout(),container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        presenter = createPresenter();
        initComponents();
    }

    public View getItemView() {
        return itemView;
    }

    @Override
    public T getPresenter() {
        return presenter;
    }

    public abstract int getFragmentLayout();
    public abstract void initComponents();
}
