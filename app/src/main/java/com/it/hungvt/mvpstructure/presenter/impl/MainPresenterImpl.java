package com.it.hungvt.mvpstructure.presenter.impl;

import com.it.hungvt.mvpstructure.base.BasePresenterImpl;
import com.it.hungvt.mvpstructure.model.Account;
import com.it.hungvt.mvpstructure.presenter.MainPresenter;
import com.it.hungvt.mvpstructure.view.activity.MainView;

/**
 * Created by Administrator on 11/2/2017.
 */

public class MainPresenterImpl extends BasePresenterImpl<MainView>
        implements MainPresenter {

    public MainPresenterImpl(MainView view) {
        super(view);
    }

    @Override
    public void signIn(Account account) {
        if (account.getUsername().isEmpty() || account.getEmailAddress().isEmpty() || account.getPassword().isEmpty()) {
            if (account.getUsername().isEmpty()) {
                getView().signInFailed("Username is empty");
                return;
            }
            if (account.getEmailAddress().isEmpty()) {
                getView().signInFailed("Email Address is empty");
                return;
            }
            if (account.getPassword().isEmpty()) {
                getView().signInFailed("Password is empty");
                return;
            }
        }

        if (account.getUsername().equals("hungvt95") && account.getEmailAddress().equals("hungvt95@gmail.com")
                && account.getPassword().equals("@a123456A")) {
            getView().signInSuccessful("Sign In Successful");
        }
    }
}
