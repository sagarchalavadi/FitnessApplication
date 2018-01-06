package quiz.honeywell.com.fitnessapp.mvpbase;

import org.jetbrains.annotations.NotNull;

/**
 * Created by ADMIN on 1/6/2018.
 */

public class MVPContract {
    public interface View {
        void showApiError();
        void showFatalError();
    }

    public interface Presenter<V extends View> {
        void attachView(@NotNull V view);
        void detachView();
        View getView();
    }
}
