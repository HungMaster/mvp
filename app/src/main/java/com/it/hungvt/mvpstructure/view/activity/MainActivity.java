package com.it.hungvt.mvpstructure.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.it.hungvt.mvpstructure.R;
import com.it.hungvt.mvpstructure.base.BaseActivity;
import com.it.hungvt.mvpstructure.base.BaseView;
import com.it.hungvt.mvpstructure.model.Account;
import com.it.hungvt.mvpstructure.presenter.MainPresenter;

public class MainActivity extends BaseActivity<MainPresenter>
        implements MainView {

    private EditText edtUsername;
    private EditText edtEmailAddress;
    private EditText edtPassword;

    private Button btnSignIn;

    @Override
    public MainPresenter createPresenter() {
        return new MainPresenterImpl(this);
    }

    @Override
    public void signInSuccessful(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void signInFailed(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public int getContentViewId() {
        return R.layout.activity_main;
    }

    @Override
    public void initComponents() {
        edtUsername = findViewById(R.id.edt_username);
        edtEmailAddress = findViewById(R.id.edt_email_address);
        edtPassword = findViewById(R.id.edt_password);
        btnSignIn = findViewById(R.id.btn_sign_in);

        btnSignIn.setOnClickListener(v->{
            String username = edtUsername.getText().toString();
            String email = edtEmailAddress.getText().toString();
            String password = edtPassword.getText().toString();

            getPresenter().signIn(new Account(username,email,password));
        });


    }
}
