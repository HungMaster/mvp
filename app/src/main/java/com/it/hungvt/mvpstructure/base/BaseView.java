package com.it.hungvt.mvpstructure.base;

/**
 * Created by Administrator on 11/2/2017.
 */

public interface BaseView<T extends BasePresenter> {

    T createPresenter();

    T getPresenter();
}
