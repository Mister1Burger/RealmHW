package com.example.burge.realmhomework;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Burge on 24.09.2017.
 */

public class Adapter extends ArrayAdapter<Person> {
    List<Person> persons;


    public Adapter(@NonNull Context context, @LayoutRes int resource, List<Person> persons) {
        super(context, resource);
        this.persons = persons;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Person person = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(android.R.layout.simple_list_item_2, null);
        }
        assert person != null;
        ((TextView) convertView.findViewById(android.R.id.text1))
                .setText(String.valueOf(person.getSerialNumber()));
        ((TextView) convertView.findViewById(android.R.id.text2))
                .setText(String.valueOf(person.getSurname()+ person.getName()));
                return convertView;
    }
    public  void add(Person person){
        persons.add(person);
        notifyDataSetChanged();
    }

}

