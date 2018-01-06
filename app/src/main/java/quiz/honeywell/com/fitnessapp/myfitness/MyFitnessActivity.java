package quiz.honeywell.com.fitnessapp.myfitness;

import quiz.honeywell.com.fitnessapp.mvpbase.MVPBaseActivity;

/**
 * Created by ADMIN on 1/6/2018.
 */

public class MyFitnessActivity extends MVPBaseActivity<MyFitnessContract.View, MyFitnessPresenter>
        implements MyFitnessContract.View {
    @Override
    public int layoutId() {
        return 0;
    }
}
