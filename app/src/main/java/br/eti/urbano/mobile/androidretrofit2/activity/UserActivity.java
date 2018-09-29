package br.eti.urbano.mobile.androidretrofit2.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.eti.urbano.mobile.androidretrofit2.R;
import br.eti.urbano.mobile.androidretrofit2.bootstrap.APIClient;
import br.eti.urbano.mobile.androidretrofit2.resource.UserResource;

public class UserActivity extends AppCompatActivity {

    UserResource apiUserResouce;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        //tem o contexto da aplicação (application)
        //PASSO 4
        apiUserResouce = APIClient.getClient().create(UserResource.class);
    }
}
