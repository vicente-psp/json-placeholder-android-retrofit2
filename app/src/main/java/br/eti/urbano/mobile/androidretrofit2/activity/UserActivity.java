package br.eti.urbano.mobile.androidretrofit2.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import java.util.List;

import br.eti.urbano.mobile.androidretrofit2.R;
import br.eti.urbano.mobile.androidretrofit2.bootstrap.APIClient;
import br.eti.urbano.mobile.androidretrofit2.model.User;
import br.eti.urbano.mobile.androidretrofit2.resource.UserResource;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserActivity extends AppCompatActivity {

    UserResource apiUserResouce;

    EditText txtId;
    EditText txtUserName;
    EditText txtData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        //tem o contexto da aplicação (application)
        //PASSO 4
        apiUserResouce = APIClient.getClient().create(UserResource.class);

        Call<List<User>> get = apiUserResouce.get();

        get.enqueue(new Callback<List<User>>() {

            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {

            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {

            }
        });

        String username,data;
        Integer id;
        id = Integer.parseInt(txtId.getText().toString());
        username = txtUserName.getText().toString();
        data = txtData.getText().toString();


        User user = User.builder()
                .id(1)
                .userName("")
                .avatar(new byte[3])
                .uuid("")
                .data("")
                .build();

        //Call<User> post = apiUserResouce.post(user);






    }
}
