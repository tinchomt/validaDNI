package mt.com.peypedni.lectordni;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Map;
import java.util.TreeMap;

import mt.com.peypedni.R;
import mt.com.peypedni.modelo.Example;
import mt.com.peypedni.remote.APIUtils;
import mt.com.peypedni.remote.UserService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ValidarPersona extends AppCompatActivity {

    UserService userService;
    Map<String, String> mapaResultados = new TreeMap<String, String>();
    String valores;
    String valor_dni;
    String valor_sexo;

    TextView txt_resultado_var, txt_detalle_var, txt_detalle_descrip_var;

//    String result_valida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validar_persona);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        System.out.println("Paso 10 ");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        txt_resultado_var =  (TextView) findViewById(R.id.editResultado);
        txt_detalle_var =  (TextView) findViewById(R.id.editDescripResult);
        txt_detalle_descrip_var =  (TextView) findViewById(R.id.txtDetalle);

        System.out.println("Paso 11 ");
         Intent intent = getIntent();

        System.out.println("Paso 12 ");

        valores = intent.getExtras().getString("valores");
        System.out.println("Resultados: "+valores);

        if(valores != null){

            parserResultados(valores);
            valor_dni = mapaResultados.get("dni");
            valor_sexo = mapaResultados.get("sexo");

        }else{

            valor_dni = intent.getExtras().getString("dni");
            valor_sexo =  intent.getExtras().getString("sexo");
        }

        System.out.println("Paso 13 ");

        userService = APIUtils.getUserService();
        System.out.println("Paso 14 ");


        buscarPersona("wsprueba","123MT",valor_dni,valor_sexo);

    }



    public void buscarPersona(String usr, String clave,String dni,String sexo){

        System.out.print("buscarPersona "+dni);
        //Call<List<User>> call = userService.getUsers();
        Call<Example> call = userService.getPersona(usr,clave,Integer.parseInt(dni),sexo);

        call.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {

                System.out.println("response.isSuccessful(): "+response);
                if(response.isSuccessful()){
                    System.out.println("response.isSuccessful(): ");
                    if(response.body() !=null) {

                        System.out.println(response.body().toString());
                        System.out.println(response.body().getRESULTADO().getMotorDecision().getRow().getHabilitadoCredito());

                        String res_val = response.body().getRESULTADO().getMotorDecision().getRow().getHabilitadoCredito();
                        String var_result = parserValida(res_val);
                        System.out.println("Var Result: "+var_result);

                        if(var_result.contains("OK")){
                            txt_resultado_var.setText("APROBADO");
                            txt_resultado_var.setTextColor(Color.GREEN);
                            txt_detalle_descrip_var.setVisibility(View.INVISIBLE);
                            txt_detalle_var.setVisibility(View.INVISIBLE);

                        }else{
                            txt_resultado_var.setText("RECHAZADO");
                            txt_resultado_var.setTextColor(Color.RED);
                            txt_detalle_var.setText(var_result);
                        }


                    }else{

                        Toast.makeText(getApplicationContext(), "No esta Registrado el DNI",
                                Toast.LENGTH_LONG).show();
                    }

                    //list = response.body();
                    //listView.setAdapter(new UserAdapter(BuscarAsistente.this, R.layout.list_user, list));
                }
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {
                Log.e("ERROR catch: ", t.getMessage());
                Log.e("ERROR catch 1: ", call.toString());

            }
        });
    }
    public void parserResultados(String valores){

        String[] val = valores.split("@");
        mapaResultados.put("apellido",val[1]);
        mapaResultados.put("nombre",val[2]);
        mapaResultados.put("sexo",val[3]);
        mapaResultados.put("dni",val[4]);
        mapaResultados.put("f_nacimiento",val[6]);

    }

    public String parserValida(String valores){

        String[] val = valores.split("@");

       String result_valida = val[0];

       return result_valida;
    }
}
