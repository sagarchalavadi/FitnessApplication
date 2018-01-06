package quiz.honeywell.com.fitnessapp.network;

import java.util.List;
import java.util.Map;

import quiz.honeywell.com.fitnessapp.events.EventsRequest;
import quiz.honeywell.com.fitnessapp.events.EventsResponse;
import quiz.honeywell.com.fitnessapp.login.LoginResponse;
import quiz.honeywell.com.fitnessapp.registration.RegistrationRequest;
import quiz.honeywell.com.fitnessapp.registration.RegistrationResponse;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by ADMIN on 1/6/2018.
 */

public interface ServiceApis {
    Observable<LoginResponse> login(@Query("userName") String userName, @Query("password") String password);

    Observable<RegistrationResponse> registration(RegistrationRequest registrationRequest);

    Observable<List<EventsResponse>> getEvents();

    Observable<List<EventsResponse>> createEvent(EventsRequest eventsRequest);
}
