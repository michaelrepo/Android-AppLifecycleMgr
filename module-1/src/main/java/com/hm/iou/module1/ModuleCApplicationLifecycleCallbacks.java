package com.hm.iou.module1;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.hm.iou.lifecycle.annotation.AppLifecycle;
import com.hm.lifecycle.api.IApplicationLifecycleCallbacks;
import com.performance.appstart.TaskDispatcher;

/**
 * Created by hjy on 2018/10/23.
 */
@AppLifecycle
public class ModuleCApplicationLifecycleCallbacks implements IApplicationLifecycleCallbacks {

    @Override
    public int getPriority() {
        return MAX_PRIORITY;
    }

    @Override
    public void onCreate(Context context, TaskDispatcher taskDispatcher, Bundle bundle) {
        Log.d("AppLifecycle", "onCreate(): this is in ModuleCApplicationLifecycleCallbacks.");
    }

    @Override
    public void onTerminate() {
        Log.d("AppLifecycle", "onTerminate(): this is in ModuleCApplicationLifecycleCallbacks.");
    }

    @Override
    public void onLowMemory() {

    }

    @Override
    public void onTrimMemory(int level) {

    }
}
