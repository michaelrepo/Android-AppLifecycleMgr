package com.hm.lifecycle.api;

import android.content.Context;
import android.os.Bundle;

import com.performance.appstart.TaskDispatcher;

/**
 * Created by hjy on 2018/10/23.
 */

public interface IApplicationLifecycleCallbacks {

    int MAX_PRIORITY = 10;
    int MIN_PRIORITY = 1;
    int NORM_PRIORITY = 5;

    int getPriority();

    void onCreate(Context context, TaskDispatcher taskDispatcher, Bundle bundle);

    void onTerminate();

    void onLowMemory();

    void onTrimMemory(int level);
}