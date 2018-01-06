package quiz.honeywell.com.fitnessapp.myfitness;

import quiz.honeywell.com.fitnessapp.mvpbase.MVPContract;

/**
 * Created by ADMIN on 1/6/2018.
 */

public class MyFitnessContract {
    interface View extends MVPContract.View {

    }

    interface Presenter<V extends View> extends MVPContract.Presenter<V> {

    }
}
