package com.example.burge.realmhomework;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Burge on 21.09.2017.
 */

public class MainFragment extends Fragment {
    @BindView(R2.id.name_et)
    EditText name_et;
    @BindView(R2.id.surname_et)
    EditText surname_et;
    @BindView(R2.id.serial_number_et)
    EditText serial_number_et;
    @BindView(R2.id.save_btn)
    Button save_btn;
    @BindView(R2.id.persons_lv)
    ListView persons_lv;
    List<Person> persons;
    RealmPersons realmPersons = new RealmPersons();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment, container, false);
        ButterKnife.bind(this, view);
        return view;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ArrayAdapter<Person> adapter = new ArrayAdapter<Person>(getActivity(),R.layout.fragment,realmPersons.readPersons(getActivity()));
        persons_lv.setAdapter(adapter);


    }

    public RealmPersons addPerson(){

        Person person = new Person();
        person.setName(String.valueOf(name_et.getText()));
        person.setSurname(String.valueOf(surname_et.getText()));
        person.setSerialNumber(Integer.parseInt((serial_number_et.getText().toString())));
         save_btn.setOnClickListener(view -> realmPersons.saveReminder(getActivity(), person));
        return realmPersons;

}


}
