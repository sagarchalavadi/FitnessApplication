package quiz.honeywell.com.fitnessapp.login;

import quiz.honeywell.com.fitnessapp.mvpbase.MVPContract;

/**
 * Created by ADMIN on 1/6/2018.
 */

public class LoginContract {
    public interface View extends MVPContract.View {
        String getUserName();
        String getPassword();
        void userNameError(String errorMessage);
        void passwordError(String errorMessage);
    }

    public interface Presenter<V extends View> extends MVPContract.Presenter<V> {
        void login();
    }
}
