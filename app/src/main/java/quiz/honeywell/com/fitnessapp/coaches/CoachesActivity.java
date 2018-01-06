package quiz.honeywell.com.fitnessapp.coaches;

import quiz.honeywell.com.fitnessapp.mvpbase.MVPBaseActivity;

/**
 * Created by ADMIN on 1/6/2018.
 */

public class CoachesActivity extends MVPBaseActivity<CoachesContract.View, CoachesPresenter> implements CoachesContract.View {
    @Override
    public int layoutId() {
        return 0;
    }
}
