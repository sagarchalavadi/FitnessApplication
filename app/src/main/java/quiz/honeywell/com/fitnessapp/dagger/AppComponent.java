package quiz.honeywell.com.fitnessapp.dagger;

import javax.inject.Singleton;

import dagger.Component;
import quiz.honeywell.com.fitnessapp.FitnessApp;
import quiz.honeywell.com.fitnessapp.dagger.modules.AppModule;
import quiz.honeywell.com.fitnessapp.dagger.modules.NetModule;

/**
 * Created by ADMIN on 1/6/2018.
 */
@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface AppComponent {
    void inject(FitnessApp fitnessApp);
}
