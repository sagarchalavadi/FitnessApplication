package quiz.honeywell.com.fitnessapp.dagger;

import javax.inject.Singleton;

import dagger.Component;
import quiz.honeywell.com.fitnessapp.dagger.modules.AppModule;
import quiz.honeywell.com.fitnessapp.dagger.modules.NetModule;
import quiz.honeywell.com.fitnessapp.mvpbase.MVPBaseActivity;

/**
 * Created by ADMIN on 1/6/2018.
 */
@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface AppComponent {
    void inject(MVPBaseActivity fitnessApp);
}
