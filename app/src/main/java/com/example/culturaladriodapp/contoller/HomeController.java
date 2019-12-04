package com.example.culturaladriodapp.contoller;

import android.app.Activity;
import android.content.Intent;
import android.widget.Button;
import android.widget.ListView;

import com.example.culturaladriodapp.R;
import com.example.culturaladriodapp.model.dao.ArtistDao;
import com.example.culturaladriodapp.model.dto.AdapterArtist;
import com.example.culturaladriodapp.model.dto.Artist;
import com.example.culturaladriodapp.model.dto.Person;
import com.example.culturaladriodapp.utils.ConstSystem;
import com.example.culturaladriodapp.view.MainActivity;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cz.msebera.android.httpclient.Header;

public class HomeController {

    private Activity activity;
    private ListView listView;
    private Button btnVoltar;
    private AdapterArtist artistAdapter;
    private ArtistDao artistDao;

    public  HomeController(Activity activity) throws SQLException {
        this.activity = activity;

//        artistDao = new ArtistDao(activity);
//
        initComponents();
        carregarListView();
//        Artist artist = new Artist();
//        artist.setName("Andrey");
//        artist.setPassword("PASSWORD");
//        artist.setIndividualRegistration("generateIndividualRegistration()");
//        artist.setUserName("User Name");
//        artist.setEmail("Cacaca ");
//        artist.setLastName("Rosa ");
//        artist.setId(1);


//
//        artistDao.getDao().createIfNotExists(artist);
//        artistAdapter.add(artist);
    }

    private void initComponents() {
        listView = activity.findViewById(R.id.artistlv);
        btnVoltar = activity.findViewById(R.id.voltar);
        AsyncHttpClient client = new AsyncHttpClient();
        client.get(activity,"http://10.0.2.2:9080/v1/artist", new AsyncHttpResponseHandler(){


            @Override
            public void onSuccess(int i, Header[] headers, byte[] bytes) {
                String responseSting = new String(bytes);
                Gson g = new Gson();

//                Type usuariosListType =  new TypeToken<ArrayList<Artist>>(){}.getType();
//                List<Artist> participantJsonList = mapper.readValue(jsonString, new TypeReference<List<Student>>(){});
                Artist[] artistList = g.fromJson(responseSting,  Artist[].class);
//                Artist  a =  g.fromJson(responseSting, usuariosListType);
//                System.out.println(a);
                for (Artist a: artistList) {
                    artistAdapter.add(a);
                }
//                artistAdapter.add(artist);
            }

            @Override
            public void onFailure(int i, Header[] headers, byte[] bytes, Throwable throwable) {

            }
        });
    }
    private void carregarListView(){
        artistAdapter = new AdapterArtist(
                new ArrayList<Artist>(),
                activity
                );

        listView.setAdapter(artistAdapter);
    }
}

