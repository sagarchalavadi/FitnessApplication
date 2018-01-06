package quiz.honeywell.com.fitnessapp.network;

import java.util.List;
import java.util.Map;

import quiz.honeywell.com.fitnessapp.events.EventsRequest;
import quiz.honeywell.com.fitnessapp.events.EventsResponse;
import quiz.honeywell.com.fitnessapp.login.LoginResponse;
import quiz.honeywell.com.fitnessapp.network.retrofit.ApiServices;
import quiz.honeywell.com.fitnessapp.registration.RegistrationRequest;
import quiz.honeywell.com.fitnessapp.registration.RegistrationResponse;
import quiz.honeywell.com.fitnessapp.util.ObjectToMapMapper;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by ADMIN on 1/6/2018.
 */

public class RemoteRepository implements ServiceApis {

    private ApiServices apiServices;

    public RemoteRepository(ApiServices apiServices) {
        this.apiServices = apiServices;
    }

    @Override
    public Observable<LoginResponse> login(String userName, String password) {
        return apiServices.login(userName, password)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    @Override
    public Observable<RegistrationResponse> registration(RegistrationRequest registrationRequest) {
        return apiServices.registration(ObjectToMapMapper.getParams(registrationRequest.getClass()))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    @Override
    public Observable<List<EventsResponse>> getEvents() {
        return apiServices.getEvents()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    @Override
    public Observable<List<EventsResponse>> createEvent(EventsRequest eventsRequest) {
        return apiServices.createEvent(ObjectToMapMapper.getParams(eventsRequest.getClass()))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
