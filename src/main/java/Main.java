import com.google.gson.Gson;
import com.google.gson.JsonObject;
import okhttp3.*;
import org.json.JSONObject;

import java.io.IOException;

public class Main {
    public void makeGetRequest() throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("http://172.105.56.56:8081/generateOtp")
                .build();
        Call call = client.newCall(request);
        Response response = call.execute();
        System.out.println(response.body().string());
        System.out.println(response.body().string());
    }

    public void makeGetParamRequest() throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        HttpUrl.Builder urlBuilder = HttpUrl.parse("http://127.0.0.1:8081/userGetsProfile").newBuilder();
        urlBuilder.addEncodedQueryParameter("number","01720024944");
        String url = urlBuilder.build().toString();

        Request request = new Request.Builder()
                .url(url)
                //.addHeader("Authorization","Bearer ")
                .build();
        Call call = client.newCall(request);
        Response response = call.execute();
        Gson gson = new Gson();
        User user = gson.fromJson(response.body().string(), User.class);
        System.out.println(user.toString());
    }

    public void makePostRequest() throws IOException {
        final MediaType JSON
                = MediaType.parse("application/json; charset=utf-8");
        OkHttpClient client = new OkHttpClient();
        var user = new User();
        user.setName("Kamrul Hassan Jewel");
        user.setPassword("$2a$10$gwgXfv0hm857MgMn/vaTo.SSLkT5PFADi0kzf8kOf.jHMUsv2KazG");
        user.setActive(true);
        user.getRoles().add(new Role(1,"user"));
        JSONObject jsonObject = new JSONObject();
        jsonObject.accumulate("user", user);
        RequestBody body = RequestBody.create(jsonObject.toString(), JSON); // new
        // RequestBody body = RequestBody.create(JSON, json); // old
        Request request = new Request.Builder()
                .url("http://127.0.0.1:8081/registerUser")
                .post(body)
                .build();
        Response response = client.newCall(request).execute();
        System.out.println("response is "+response.body().string());
    }

    public static void main(String args[]) throws IOException {
        Main main = new Main();
        main.makePostRequest();
    }
}
