package quiz.honeywell.com.fitnessapp.settings;

import quiz.honeywell.com.fitnessapp.mvpbase.MVPBaseActivity;

/**
 * Created by ADMIN on 1/6/2018.
 */

public class SettingsActivity extends MVPBaseActivity<SettingsContract.View, SettingsPresenter>
        implements SettingsContract.View {
    @Override
    public int layoutId() {
        return 0;
    }
}
