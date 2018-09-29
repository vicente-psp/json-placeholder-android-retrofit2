package br.eti.urbano.mobile.androidretrofit2.resource;

import java.util.List;

import br.eti.urbano.mobile.androidretrofit2.interfaces.GenericInterfaceOperations;
import br.eti.urbano.mobile.androidretrofit2.model.User;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;

/**
 * Created by bruno on 28/09/18.
 */


public interface UserResource {

    @GET("api/email")
    Call<List<User>> get();

    @POST("api/email/add")
    Call<User> post(@Body User user);

    @PUT("api/email/change")
    Call<User> put(@Body User user);

    @DELETE("api/email/delete")
    Call<Void> delete(@Body User user);
}
