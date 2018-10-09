import model.response.GroupRes;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class getMessageGroupInfo {
    public static void main(String[] args) {
        Call<GroupRes> api = APIInit.getAPI().getGroupInfo(APIInit.getHeaders(), "G4V20181010084150DSG0DUFFGYH3ODC");
        getGroupInfo(api);
    }

    static void getGroupInfo(Call<GroupRes> api) {
        api.enqueue(new Callback<GroupRes>() {
            @Override
            public void onResponse(Call<GroupRes> call, Response<GroupRes> response) {
                GroupRes body = response.body();
                System.out.println("agent : " + body.getAgent());
                System.out.println("count : " + body.getCount());
                System.out.println("log : " + body.getLog());
                System.out.println("status : " + body.getStatus());
                System.out.println("scheduledDate : " + body.getScheduledDate());
                System.out.println("accountId : " + body.getAccountId());
                System.out.println("apiVersion : " + body.getApiVersion());
                System.out.println("groupId : " + body.getGroupId());
                System.out.println("dateCreated : " + body.getDateCreated());
                System.out.println("dateUpdated : " + body.getDateUpdated());
                System.out.println("_id : " + body.get_id());
            }

            @Override
            public void onFailure(Call<GroupRes> call, Throwable throwable) {
                throwable.printStackTrace();
            }
        });
    }
}
