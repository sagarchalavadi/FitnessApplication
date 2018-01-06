package quiz.honeywell.com.fitnessapp.login;

import android.text.TextUtils;

import quiz.honeywell.com.fitnessapp.mvpbase.MVPPresenter;

/**
 * Created by ADMIN on 1/6/2018.
 */

public class LoginPresenter extends
        MVPPresenter<LoginContract.View> implements LoginContract.Presenter<LoginContract.View>{
    @Override
    public void login() {
        String userName = getView().getUserName();
        if(TextUtils.isEmpty(userName)) {
            getView().userNameError("User name is empty");
        }
    }
}
