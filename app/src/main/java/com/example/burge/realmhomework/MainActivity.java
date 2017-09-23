package com.example.burge.realmhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity {
    Person person;
    RealmPersons realmPersons = new RealmPersons();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        person.setPersons(realmPersons.readPersons(this));
        getFragmentManager().beginTransaction()
                .replace(R.id.fl,new MainFragment())
                .commit();
    }


}
