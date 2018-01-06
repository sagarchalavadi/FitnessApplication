package quiz.honeywell.com.fitnessapp.events;

import quiz.honeywell.com.fitnessapp.mvpbase.MVPContract;
import quiz.honeywell.com.fitnessapp.mvpbase.MVPPresenter;

/**
 * Created by ADMIN on 1/6/2018.
 */

public class EventsContract {

    public interface View extends MVPContract.View {

    }

    public interface Presenter<V extends View> extends MVPContract.Presenter<V> {

    }
}
