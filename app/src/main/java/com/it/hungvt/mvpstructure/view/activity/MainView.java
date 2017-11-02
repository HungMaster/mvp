package com.it.hungvt.mvpstructure.view.activity;

import com.it.hungvt.mvpstructure.base.BaseView;
import com.it.hungvt.mvpstructure.presenter.MainPresenter;

/**
 * Created by Administrator on 11/2/2017.
 */

public interface MainView extends BaseView<MainPresenter> {
    void signInSuccessful(String msg);
    void signInFailed(String msg);

}
