package quiz.honeywell.com.fitnessapp.goals;

import quiz.honeywell.com.fitnessapp.mvpbase.MVPContract;

/**
 * Created by ADMIN on 1/6/2018.
 */

public class GoalsContract {
    public interface View extends MVPContract.View {

    }

    public interface Presenter<V extends View> extends MVPContract.Presenter<V> {

    }
}
