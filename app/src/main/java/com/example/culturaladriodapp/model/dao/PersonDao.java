package com.example.culturaladriodapp.model.dao;

import android.content.Context;

import com.example.culturaladriodapp.model.dto.Person;

public class PersonDao extends  DaoHelper<Person> {
    public PersonDao(Context c) {
        super(c, Person.class);
    }
}
