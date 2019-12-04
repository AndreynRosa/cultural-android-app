package com.example.culturaladriodapp.contoller;

import android.app.Activity;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;

import com.example.culturaladriodapp.R;
import com.example.culturaladriodapp.model.dao.ArtistDao;
import com.example.culturaladriodapp.model.dto.AdapterArtist;
import com.example.culturaladriodapp.model.dto.Artist;
import com.example.culturaladriodapp.model.dto.Person;
import com.example.culturaladriodapp.utils.ConstSystem;
import com.example.culturaladriodapp.view.HomeUser;
import com.example.culturaladriodapp.view.MainActivity;
import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import java.io.Serializable;
import java.sql.SQLException;

import cz.msebera.android.httpclient.Header;
import cz.msebera.android.httpclient.entity.StringEntity;

public class NewUserController {

    private Activity activity;
    private EditText editTextNome;
    private EditText editTextSobreNome;
    private EditText editTextCpf;
    private EditText editTextEmail;
    private EditText editTextSenha;
    private EditText editTextUserName;
    private Button btnSalvar;
    private ArtistDao artistDao;
    private AdapterArtist artistAdapter;

    public NewUserController(Activity activity) {
        this.activity = activity;
        initComponents();
    }

    private void initComponents() {
        editTextNome = activity.findViewById(R.id.nome);
        editTextSobreNome = activity.findViewById(R.id.soreNome);
        editTextCpf = activity.findViewById(R.id.cpf);
        editTextEmail = activity.findViewById(R.id.email);
        editTextSenha = activity.findViewById(R.id.senha);
        editTextUserName = activity.findViewById(R.id.usrName);
        btnSalvar = activity.findViewById(R.id.saveArtist);
        artistDao = new ArtistDao(activity);
    }

    public void salvar() throws SQLException {
        AsyncHttpClient client = new AsyncHttpClient();
        RequestParams params = new RequestParams();
        final Artist artistRequest = new Artist();

        artistRequest.setUserName(editTextUserName.getText().toString());
        artistRequest.setEmail(editTextEmail.getText().toString());
        artistRequest.setIndividualRegistration(editTextCpf.getText().toString());
        artistRequest.setName(editTextNome.getText().toString());
        artistRequest.setPassword(editTextSenha.getText().toString());
        artistRequest.setLastName(editTextSobreNome.getText().toString());
        params.put("artistRequest", artistRequest);

        artistDao.getDao().createIfNotExists(artistRequest);
//        artistAdapter.add(artistRequest);
        System.out.println(artistDao.getDao().queryForAll());
        Gson g = new Gson();
        StringEntity se = null;
        try{

            se = new StringEntity(g.toJson(artistRequest));
        }catch (Exception e){

        }
        client.post(activity,"http://10.0.2.2:9080/v1/artist", se,"application/json" ,new AsyncHttpResponseHandler(){


            @Override
            public void onSuccess(int i, Header[] headers, byte[] bytes) {
                String responseSting = new String(bytes);

                System.out.println(responseSting);

                Intent it = new Intent(activity, MainActivity.class);
                Person person = new Person();
                it.putExtra("artist", (Serializable) artistRequest);
                activity.startActivityForResult(it, ConstSystem.Request.DATA_USER);
            }

            @Override
            public void onFailure(int i, Header[] headers, byte[] bytes, Throwable throwable) {

            }
        });

    }

    public void votar() {
        activity.finish();
    }
}
