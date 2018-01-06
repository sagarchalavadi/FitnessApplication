package quiz.honeywell.com.fitnessapp.dagger;

import javax.inject.Singleton;

import dagger.Component;
import quiz.honeywell.com.fitnessapp.FitnessApp;

/**
 * Created by ADMIN on 1/6/2018.
 */
@Singleton
@Component
public interface AppComponent {
    void inject(FitnessApp fitnessApp);
}
