package mt.com.peypedni.remote;

import java.util.List;

import mt.com.peypedni.modelo.Asistente;
import mt.com.peypedni.modelo.Example;
import mt.com.peypedni.modelo.RegistraEvento;
import mt.com.peypedni.modelo.User;
import mt.com.peypedni.modelo.Usuario;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Created by martin on 10/08/18.
 */

public interface UserService {

    @GET("users/")
    Call<List<User>> getUsers();


    @GET("users/{id}")
    Call<User> getUser(@Path("id") int id);

    @POST("users/")
    Call<User> addUser(@Body User user);

    @PUT("users/{id}")
    Call<User> updateUser(@Path("id") int id, @Body User user);

    @DELETE("users/{id}")
    Call<User> deleteUser(@Path("id") int id);



    @GET("asistentes/{dni}")
    Call<Asistente> getAsistente(@Path("dni") int dni);


    @POST("registrar-acceso/")
    Call<RegistraEvento> registraAcceso(@Body RegistraEvento registra);


    @GET("usuario/{login}/{clave}")
    Call<Usuario> getUsuario(@Path("login") String login, @Path("clave") String clave);


    @GET("serviciospyp/persona/{usuario}/{clave}/{dni}/{sexo}/json")
    Call<Example> getPersona(@Path("usuario") String usuario, @Path("clave") String clave,
                             @Path("dni") int dni,@Path("sexo") String sexo);

}
