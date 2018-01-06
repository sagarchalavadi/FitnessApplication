package quiz.honeywell.com.fitnessapp.mvpbase;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ADMIN on 1/6/2018.
 */

public abstract class MVPBaseFragment<V extends MVPContract.View, P extends MVPContract.Presenter<V>> extends Fragment implements MVPContract.View {



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Nullable
    @Override
    public final View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(layoutId(), container, false);
    }

    abstract @LayoutRes int layoutId();

    @Override
    public void showApiError() {

    }

    @Override
    public void showFatalError() {

    }
}
