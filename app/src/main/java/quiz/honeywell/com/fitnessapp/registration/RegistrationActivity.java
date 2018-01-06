package quiz.honeywell.com.fitnessapp.registration;

import quiz.honeywell.com.fitnessapp.mvpbase.MVPBaseActivity;

/**
 * Created by ADMIN on 1/6/2018.
 */

public class RegistrationActivity extends MVPBaseActivity<RegistrationContract.View, RegistrationPresenter>
        implements RegistrationContract.View {
    @Override
    public int layoutId() {
        return 0;
    }
}
