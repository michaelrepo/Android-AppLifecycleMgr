package com.hm.iou.lifecycle.demo;

import android.app.Application;
import android.os.Bundle;

import com.hm.lifecycle.api.ApplicationLifecycleManager;
import com.performance.appstart.TaskDispatcher;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        //
        ApplicationLifecycleManager.init();
        Bundle bundle = new Bundle();
        bundle.putString("dd", "哈哈");
        TaskDispatcher.init(this,BuildConfig.DEBUG);
        ApplicationLifecycleManager.onCreate(this, TaskDispatcher.createInstance(), bundle);
    }
}
