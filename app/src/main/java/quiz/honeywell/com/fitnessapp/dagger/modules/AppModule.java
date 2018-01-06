package quiz.honeywell.com.fitnessapp.dagger.modules;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ADMIN on 1/6/2018.
 */
@Module
public class AppModule {

    public static final String APP_PREFERENCES = "fitness-app-prefs";

    private Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    Context provideContext() {
        return application;
    }

    @Provides
    @Singleton
    Application provideApplication() {
        return application;
    }

    @Provides
    @Singleton
    SharedPreferences provideSharedPrefs() {
        return application.getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);
    }
}
