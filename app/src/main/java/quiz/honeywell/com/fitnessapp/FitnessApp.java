package quiz.honeywell.com.fitnessapp;

import android.app.Application;

import quiz.honeywell.com.fitnessapp.dagger.AppComponent;
import quiz.honeywell.com.fitnessapp.dagger.DaggerAppComponent;
import quiz.honeywell.com.fitnessapp.dagger.modules.AppModule;
import quiz.honeywell.com.fitnessapp.dagger.modules.NetModule;

/**
 * Created by ADMIN on 1/6/2018.
 */

public class FitnessApp extends Application {

    private AppComponent appComponent;

    private String url = "";

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule(url))
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
