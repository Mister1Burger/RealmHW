package com.example.burge.realmhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity {

    RealmPersons realmPersons = new RealmPersons();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getFragmentManager().beginTransaction()
                .replace(R.id.fl,new MainFragment())
                .commit();
    }


}
