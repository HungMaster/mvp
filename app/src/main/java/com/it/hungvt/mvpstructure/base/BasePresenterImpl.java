package com.it.hungvt.mvpstructure.base;

/**
 * Created by Administrator on 11/2/2017.
 */

public class BasePresenterImpl<T extends BaseView>
        implements BasePresenter {

    private T view;

    public BasePresenterImpl(T view) {
        this.view = view;
    }

    public T getView() {
        return view;
    }
}
