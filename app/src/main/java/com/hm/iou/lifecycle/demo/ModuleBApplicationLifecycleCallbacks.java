package com.hm.iou.lifecycle.demo;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.hm.iou.lifecycle.annotation.AppLifecycle;
import com.hm.lifecycle.api.IApplicationLifecycleCallbacks;

/**
 * Created by hjy on 2018/10/23.
 */
@AppLifecycle
public class ModuleBApplicationLifecycleCallbacks implements IApplicationLifecycleCallbacks {

    @Override
    public int getPriority() {
        return NORM_PRIORITY;
    }

    @Override
    public void onCreate(Context context, Bundle bundle) {
        Log.i("bundleB", bundle.getString("dd"));
        Log.d("AppLifecycle", "onCreate(): this is in ModuleBApplicationLifecycleCallbacks.");
    }

    @Override
    public void onTerminate() {
        Log.d("AppLifecycle", "onTerminate(): this is in ModuleBApplicationLifecycleCallbacks.");
    }

    @Override
    public void onLowMemory() {

    }

    @Override
    public void onTrimMemory(int level) {

    }
}
