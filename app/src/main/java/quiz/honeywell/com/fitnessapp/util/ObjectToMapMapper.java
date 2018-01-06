package quiz.honeywell.com.fitnessapp.util;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import quiz.honeywell.com.fitnessapp.network.BaseRequest;

/**
 * Created by ADMIN on 1/6/2018.
 */

public class ObjectToMapMapper {
    public static Map<String, String> getParams(Class<? extends BaseRequest> baseRequest) {
        Map<String, String> params = new HashMap<>();
        Field[] fields = baseRequest.getDeclaredFields();
        for (Field classField : fields) {
            try {
                params.put(classField.getName(), (String) classField.get(baseRequest));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return params;
    }
}
