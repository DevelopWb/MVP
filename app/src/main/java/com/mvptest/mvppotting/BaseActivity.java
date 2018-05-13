package com.mvptest.mvppotting;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Author:wang_sir
 * Time:2018/5/13 14:37
 * Description:This is BaseActivity
 * 泛型V代表View
 */
public abstract class BaseActivity<V,T extends BasePresent<V>> extends AppCompatActivity {
    public String TAG = getClass().getSimpleName() + "";

    private T mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initViewLayout();
        findViewById();
        //创建presenter
        mPresenter = creatPresenter();
        getDate();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (mPresenter != null) {
            mPresenter.onAttachView((V) this);
        }
    }

    /**
     * 初始化布局
      */
    public abstract void initViewLayout();

    /**
     * 初始化view
     */
    public abstract void findViewById();

    /**
     * 获取数据
     */
    public abstract void getDate();

    /**
     * 创建presenter
     */
    public abstract T creatPresenter();


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }
}
