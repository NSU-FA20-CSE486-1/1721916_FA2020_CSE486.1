package course.cse486.foodfest.utils.fcm;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAnL12uTs:APA91bEVJU4c_eIv4uZXP0JeE11RLdBMaVCEprLo1shWjvkYNYitCAVsixV3uIrEa23ukQHpcixQ-uAEjcMC9m01G17qGncl8FoDuZ5nKMpCxoqg7sWHk2-f2_egCvrFKS67SkoGS-5L"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body NotificationSender body);
}
