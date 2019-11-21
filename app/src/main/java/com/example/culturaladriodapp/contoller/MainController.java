package com.example.culturaladriodapp.contoller;

import android.app.Activity;
import android.content.Intent;
import android.widget.Button;

import com.example.culturaladriodapp.R;
import com.example.culturaladriodapp.model.dto.Artist;
import com.example.culturaladriodapp.model.dto.Person;
import com.example.culturaladriodapp.utils.ConstSystem;
import com.example.culturaladriodapp.view.HomeUser;
import com.example.culturaladriodapp.view.NewUserActivicty;
import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import java.io.Serializable;

import cz.msebera.android.httpclient.Header;
import cz.msebera.android.httpclient.entity.StringEntity;

public class MainController {

    private Activity activity;
    private Button newUserBtn;

    public MainController(Activity activity) {
        this.activity = activity;
        initComponents();
    }

    private void initComponents() {
        newUserBtn =activity.findViewById(R.id.newUser);
    }

    public void newUser() {
//        AsyncHttpClient client = new AsyncHttpClient();
//        RequestParams params = new RequestParams();
//        Artist artistRequest = new Artist();
//
//        artistRequest.setUserName("andrey test");
//        artistRequest.setEmail("email@test.com");
//        artistRequest.setIndividualRegistration("05389358329");
//        artistRequest.setName("andrey");
//        artistRequest.setLastName("rosa");
//        params.put("artistRequest", artistRequest);
//
//        Gson g = new Gson();
//        StringEntity se = null;
//        try{
//
//            se = new StringEntity(g.toJson(artistRequest));
//        }catch (Exception e){
//
//        }
//        client.post(activity,"http://10.0.2.2:9080/v1/artist", se,"application/json" ,new AsyncHttpResponseHandler(){
//
//
//            @Override
//            public void onSuccess(int i, Header[] headers, byte[] bytes) {
//                String responseSting = new String(bytes);
//                System.out.println(responseSting);
//
//            }
//
//            @Override
//            public void onFailure(int i, Header[] headers, byte[] bytes, Throwable throwable) {
//
//            }
//        });

        Intent it = new Intent(activity, NewUserActivicty.class);
        Person person = new Person();
        it.putExtra("person", (Serializable) person);
        activity.startActivityForResult(it, ConstSystem.Request.DATA_USER);

    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
    }

    public void login() {
        Intent it = new Intent(activity, HomeUser.class);
        Person person = new Person();
        it.putExtra("person", (Serializable) person);
        activity.startActivityForResult(it, ConstSystem.Request.DATA_USER);
    }
}
