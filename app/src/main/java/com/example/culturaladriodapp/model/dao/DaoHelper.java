package com.example.culturaladriodapp.model.dao;

import android.content.Context;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

public class DaoHelper<T> {
    protected Dao<T, Integer> dao;
    protected Class className;
    public static MyORMLiteHelper mInstance = null;

    public DaoHelper(Context c, Class className){
        this.className = className;
        if(mInstance==null){
            mInstance = new MyORMLiteHelper(c.getApplicationContext());
        }
    }

    public Dao<T, Integer> getDao(){
        try {
            return mInstance.getDao(className);
        } catch (SQLException e) {
            return null;
        }
    }
}
