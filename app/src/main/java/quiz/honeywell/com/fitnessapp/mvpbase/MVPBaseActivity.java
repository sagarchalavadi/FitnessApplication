package quiz.honeywell.com.fitnessapp.mvpbase;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import quiz.honeywell.com.fitnessapp.FitnessApp;

/**
 * Created by ADMIN on 1/6/2018.
 */

public abstract class MVPBaseActivity<V extends MVPContract.View, P extends MVPContract.Presenter<V>>
        extends AppCompatActivity implements MVPContract.View {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layoutId());
        ((FitnessApp)getApplicationContext()).getAppComponent().inject(this);
    }

    public abstract @LayoutRes int layoutId();

    @Override
    public void showApiError() {

    }

    @Override
    public void showFatalError() {

    }
}
