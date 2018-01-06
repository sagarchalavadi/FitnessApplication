package quiz.honeywell.com.fitnessapp.dashboard;

import quiz.honeywell.com.fitnessapp.mvpbase.MVPContract;

/**
 * Created by ADMIN on 1/6/2018.
 */

public class DashboardContract {
    public interface View extends MVPContract.View {

    }

    public interface Presenter<V extends MVPContract.View> extends MVPContract.Presenter<V> {

    }
}
