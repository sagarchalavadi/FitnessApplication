package quiz.honeywell.com.fitnessapp.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatButton;
import android.view.View;

import butterknife.BindView;
import quiz.honeywell.com.fitnessapp.R;
import quiz.honeywell.com.fitnessapp.coaches.CoachesActivity;
import quiz.honeywell.com.fitnessapp.events.EventsActivity;
import quiz.honeywell.com.fitnessapp.mvpbase.MVPBaseActivity;
import quiz.honeywell.com.fitnessapp.myfitness.MyFitnessActivity;
import quiz.honeywell.com.fitnessapp.settings.SettingsActivity;

/**
 * Created by ADMIN on 1/6/2018.
 */

public class DashboardActivity extends MVPBaseActivity<DashboardContract.View, DashboardPresenter>
        implements DashboardContract.View, View.OnClickListener {

    @BindView(R.id.my_fitness)
    AppCompatButton myFitness;
    @BindView(R.id.events)
    AppCompatButton events;
    @BindView(R.id.coaches)
    AppCompatButton coaches;
    @BindView(R.id.profile)
    AppCompatButton profile;

    @Override
    public int layoutId() {
        return R.layout.activity_dashboard;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myFitness.setOnClickListener(this);
        events.setOnClickListener(this);
        coaches.setOnClickListener(this);
        profile.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Class<? extends MVPBaseActivity> className = null;
        switch (view.getId()) {
            case R.id.my_fitness:
                className = MyFitnessActivity.class;
                break;
            case R.id.events:
                className = EventsActivity.class;
                break;
            case R.id.coaches:
                className = CoachesActivity.class;
                break;
            case R.id.profile:
                className = SettingsActivity.class;
                break;
        }

        if(className == null) {
            throw new RuntimeException("Selected View is unknown");
        }

        startActivity(new Intent(this, className));
    }
}
