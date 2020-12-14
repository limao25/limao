package com.example.testone.activity;


import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.example.lib_core_one.mvp.ui.activity.BaseActivity;
import com.example.testone.R;
import com.example.testone.mvp.contract.RegContract;
import com.example.testone.mvp.model.Entity.MyRegEntity;
import com.example.testone.mvp.model.RgModel;
import com.example.testone.mvp.presenter.RgPresenter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegActivity extends BaseActivity<RgPresenter> implements RegContract.RegView {
    private EditText etUswename;
    private EditText etPassword;
    private Button btnRegistr;
    String telRegex = "^((13[0-9])|(15[^4])|(18[0-9])|(17[0-8])|(147,145))\\d{8}$";

    private String user;
    private String pwd;
    @Override
    public int BandLayout() {
        return R.layout.activity_reg;
    }

    @Override
    public void initView() {
        etUswename = (EditText) findViewById(R.id.et_uswename);
        etPassword = (EditText) findViewById(R.id.et_password);
        btnRegistr = (Button) findViewById(R.id.btn_registr);

    }

    @Override
    public void initData() {

        btnRegistr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user = etUswename.getText().toString();
                pwd = etPassword.getText().toString();

                Pattern compile = Pattern.compile(telRegex);

                Matcher matcher = compile.matcher(user);

                boolean matches = matcher.matches();
                
                if (matches){
                    mPresenter = new RgPresenter(new RgModel(),RegActivity.this);

                    mPresenter.GetReg(new MyRegEntity("1",user,pwd));

                }else {
                    Toast.makeText(RegActivity.this, "请输入正确的手机号", Toast.LENGTH_SHORT).show();
                }
            
            }
        });

    }


    @Override
    public void initAdapter(int code) {

        if (code == 0){
            Toast.makeText(this, "注册成功！", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(RegActivity.this, LoginActivity.class);
            intent.setAction("yonghu");
            intent.putExtra("username",user);
            intent.putExtra("passowrd",pwd);
            startActivity(intent);
            finish();

        }else {
            Toast.makeText(this, "抱歉！用户已经注册过了！", Toast.LENGTH_SHORT).show();
        }

    }
}