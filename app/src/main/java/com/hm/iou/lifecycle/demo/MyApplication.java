package com.hm.iou.lifecycle.demo;

import android.app.Application;
import android.os.Bundle;

import com.hm.lifecycle.api.ApplicationLifecycleManager;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        //
        ApplicationLifecycleManager.init();
        Bundle bundle = new Bundle();
        bundle.putString("dd", "哈哈");
        ApplicationLifecycleManager.onCreate(this, bundle);
    }
}
