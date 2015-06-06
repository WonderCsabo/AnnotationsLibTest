package com.example;


import android.app.Activity;

import com.example.mylib.MyBean;
import com.example.mylib.test.MyOtherBean;
import com.example.mylib.test.MyThirdBean;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EActivity;

@EActivity
public class MainActivity extends Activity {

    @Bean
    MyBean bean;
    @Bean
    MyOtherBean otherBean;
    @Bean
    MyThirdBean thirdBean;

}
