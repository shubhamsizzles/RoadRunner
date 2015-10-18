package com.example.shubhamkanodia.roadrunner;

import android.app.Application;

import com.example.shubhamkanodia.roadrunner.Helpers.Helper;
import com.parse.Parse;

import io.realm.Realm;

/**
 * Created by shubhamkanodia on 07/09/15.
 */

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.enableLocalDatastore(this);
        Helper.setContext(this);
        Parse.initialize(this, "70PhhXAuM7JFQsw5jZEiCZvUOU8n2OYsd1XaChFI", "GcfAsGuyuOvuad7QE9t4Da6P0IciHa5mRqTcr9NZ");


//        Parse.initialize(this, "wQ0QGvJnHy1UdN3Q7qVmNgJnmIGavG1YTWGgw8RX", "5SbSrgLlvmjQ0zP1DbHVBHNvz0nmlKsSqU2sn41y");
    }
}