package com.it.hungvt.mvpstructure.presenter;

import com.it.hungvt.mvpstructure.base.BasePresenter;
import com.it.hungvt.mvpstructure.model.Account;

/**
 * Created by Administrator on 11/2/2017.
 */

public interface MainPresenter extends BasePresenter{
    void signIn(Account account);
}
