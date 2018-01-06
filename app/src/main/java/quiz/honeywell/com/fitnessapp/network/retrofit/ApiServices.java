package quiz.honeywell.com.fitnessapp.network.retrofit;

import java.util.List;
import java.util.Map;

import quiz.honeywell.com.fitnessapp.events.EventsResponse;
import quiz.honeywell.com.fitnessapp.login.LoginResponse;
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

public interface ApiServices {
    @POST("/login")
    @FormUrlEncoded
    Observable<LoginResponse> login(@Query("userName") String userName, @Query("password") String password);

    @POST("/login")
    @FormUrlEncoded
    Observable<RegistrationResponse> registration(@FieldMap Map<String, String> params);

    @GET("/events")
    @FormUrlEncoded
    Observable<List<EventsResponse>> getEvents();

    @POST("/events")
    @FormUrlEncoded
    Observable<List<EventsResponse>> createEvent(@FieldMap Map<String, String> params);

}
