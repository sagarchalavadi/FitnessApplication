package quiz.honeywell.com.fitnessapp.events;

import quiz.honeywell.com.fitnessapp.mvpbase.MVPBaseActivity;

/**
 * Created by ADMIN on 1/6/2018.
 */

public class EventsActivity extends MVPBaseActivity<EventsContract.View, EventsPresenter>
        implements EventsContract.View {
    @Override
    public int layoutId() {
        return 0;
    }
}
