package quiz.honeywell.com.fitnessapp.coaches;

import quiz.honeywell.com.fitnessapp.mvpbase.MVPContract;

/**
 * Created by ADMIN on 1/6/2018.
 */

public class CoachesContract {
    public interface View extends MVPContract.View {

    }

    public interface Presenter<V extends View> extends MVPContract.Presenter<V> {

    }
}
