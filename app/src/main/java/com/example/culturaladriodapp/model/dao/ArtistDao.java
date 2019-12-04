package com.example.culturaladriodapp.model.dao;

import android.content.Context;

import com.example.culturaladriodapp.model.dto.Artist;

public class ArtistDao extends DaoHelper<Artist>{
    public ArtistDao(Context c) {
        super(c, Artist.class);
    }
}
