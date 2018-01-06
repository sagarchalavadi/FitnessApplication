package quiz.honeywell.com.fitnessapp.mvpbase;

import org.jetbrains.annotations.NotNull;

import java.lang.ref.WeakReference;

/**
 * Created by ADMIN on 1/6/2018.
 */
public class MVPPresenter<V extends MVPContract.View> implements MVPContract.Presenter<V> {

    private WeakReference<V> v;

    @Override
    public void attachView(@NotNull V view) {
        v = new WeakReference<V>(view);
    }

    @Override
    public void detachView() {
        v.clear();
        v = null;
    }

    @Override
    public V getView() {
        if(v == null) {
            throw new RuntimeException("Weakreference is garbaged");
        }
        return v.get();
    }
}
