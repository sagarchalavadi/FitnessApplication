package quiz.honeywell.com.fitnessapp.coaches;

import quiz.honeywell.com.fitnessapp.mvpbase.MVPContract;

/**
 * Created by ADMIN on 1/6/2018.
 */

public class CoachesContract {
    interface View extends MVPContract.View {

    }

    interface Presenter<V extends View> extends MVPContract.Presenter<V> {

    }
}
