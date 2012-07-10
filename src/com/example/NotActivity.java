package com.example;

import android.app.Application;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import roboguice.RoboGuice;
import roboguice.inject.InjectResource;

/**
 * Created with IntelliJ IDEA.
 * User: vagrant
 * Date: 7/9/12
 * Time: 3:31 PM
 * To change this template use File | Settings | File Templates.
 */
@Singleton
public class NotActivity {
    @Inject Application application;
    private String stringFromResource;

    public String getStringFromResource() {
//        RoboGuice.getInjector(application);
        stringFromResource = String.valueOf(application);
        return stringFromResource;
    }
}
