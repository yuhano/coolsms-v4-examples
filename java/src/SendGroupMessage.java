import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;

public class SendGroupMessage {
    public static void main(String[] args) {
        Call<ResponseBody> api = APIInit.getAPI().sendGroupMessage(APIInit.getHeaders(), "G4V20181010084150DSG0DUFFGYH3ODC");
        api.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    // 성공 시 "Success" 가 출력됩니다.
                    System.out.println(response.body().string());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable throwable) {
                throwable.printStackTrace();
            }
        });
    }
}
