package com.example.testone.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lib_core_one.mvp.presenter.BasePresenter;
import com.example.lib_core_one.mvp.ui.activity.BaseActivity;
import com.example.testone.R;
import com.example.testone.mvp.contract.LoginContract;
import com.example.testone.mvp.model.Entity.MyLoginEntity;
import com.example.testone.mvp.model.LgModel;
import com.example.testone.mvp.presenter.LgPresenter;

public class LoginActivity extends BaseActivity<LgPresenter> implements LoginContract.GetLoginView {
    private EditText etUswename;
    private EditText etPassword;
    private TextView tvRegist;
    private Button btnLogin;
    
    @Override
    public int BandLayout() {
        return R.layout.activity_login;
    }

    @Override
    public void initView() {
        etUswename = (EditText) findViewById(R.id.et_uswename);
        etPassword = (EditText) findViewById(R.id.et_password);
        tvRegist = (TextView) findViewById(R.id.tv_regist);
        btnLogin = (Button) findViewById(R.id.btn_login);

        Intent intent = getIntent();
        String yonghu = intent.getAction();
        
        if (yonghu != null){
            if (yonghu.equals("yonghu")){

                String username = intent.getStringExtra("username");
                String passowrd = intent.getStringExtra("passowrd");

                etUswename.setText(username);
                etPassword.setText(passowrd);


            }
        }
        
    }

    @Override
    public void initData() {
        tvRegist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegActivity.class);
                startActivity(intent);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etUswename.getText().toString();
                String passowrd = etPassword.getText().toString();

                mPresenter = new LgPresenter(new LgModel(),LoginActivity.this);
                mPresenter.GetLogin(new MyLoginEntity("1",username,passowrd));


            }
        });
        
    }

    @Override
    public void initToast(String Msg) {

        Toast.makeText(this, ""+ Msg, Toast.LENGTH_SHORT).show();

//        if (code == 0){
//            Toast.makeText(this, "chengg", Toast.LENGTH_SHORT).show();
//        }else {
//            Toast.makeText(this, "shibai", Toast.LENGTH_SHORT).show();
//        }
    }
}