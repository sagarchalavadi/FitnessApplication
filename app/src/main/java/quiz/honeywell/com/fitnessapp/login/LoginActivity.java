package quiz.honeywell.com.fitnessapp.login;

import quiz.honeywell.com.fitnessapp.mvpbase.MVPBaseActivity;

/**
 * Created by ADMIN on 1/6/2018.
 */

public class LoginActivity extends MVPBaseActivity<LoginContract.View, LoginPresenter>
        implements LoginContract.View{
    @Override
    public int layoutId() {
        return 0;
    }

    @Override
    public String getUserName() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public void userNameError(String errorMessage) {

    }

    @Override
    public void passwordError(String errorMessage) {

    }
}
